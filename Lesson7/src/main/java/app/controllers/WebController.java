package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class WebController {
    Connection conn = null;
    Statement stat = null;
    String param = "";

    public WebController() {

        try {
            Class.forName("org.sqlite.JDBC");
            this.conn = DriverManager.getConnection("jdbc:sqlite:lesson7.db");
            this.stat = conn.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/")
    public String load(Map<String, Object> model) {
        ArrayList<String> al = new ArrayList<>();

        try {
            ResultSet rs = stat.executeQuery("select id, lastname, name, extension from persons");

            al.add("<table class=\"table\">\n" +
                    "<thead class=\"thead-dark\">\n" +
                    "<tr>\n" +
                    "<th scope=\"col\">#</th>\n" +
                    "<th scope=\"col\">Фамилия</th>\n" +
                    "<th scope=\"col\">Имя</th>\n" +
                    "<th scope=\"col\">Отчество</th>\n" +
                    "</tr>\n" +
                    "</thead>\n" +
                    "<tbody>\n");

            while (rs.next()) {
                al.add("<tr>");
                al.add("<th scope=\"row\">" + rs.getString("id") + "</td>\n");
                al.add("<td>" + rs.getString("lastname") + "</td>\n");
                al.add("<td>" + rs.getString("name") + "</td>\n");
                al.add("<td>" + rs.getString("extension") + "</td>\n");
                al.add("</tr>\n");
            }

            al.add("</tbody>\n</table>");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            model.put("persons", String.join("", al.toArray(new String[al.size()])));
        }

        return "persons";
    }

    @RequestMapping(value = "/store", method = RequestMethod.POST)
    public String store(Map<String, Object> model,
                        @RequestParam("firstName") String firstName,
                        @RequestParam("lastName") String lastName,
                        @RequestParam("extName") String extName) {

        String sql = "insert into persons (name, lastname, extension) values (?, ?, ?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, extName);

            System.out.printf("%d rows added", preparedStatement.executeUpdate());

        } catch (SQLException e) {
            e.printStackTrace();
        }

        /**
         * Redirect to persons.html
         */
        return load(model);
    }
}
