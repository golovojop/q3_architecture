import domain.Employe;
import identitymap.EmployeManager;

import java.sql.Connection;
import java.sql.SQLException;

public class Lesson6App {

    private static Connection connection;

    public static void main(String[] args) {

        try {
            connection = JdbcConnection.getConnection();
            EmployeManager manager = new EmployeManager(connection);

            // Получить из БД
            Employe employe = manager.find(3);
            System.out.println(employe);

            // Получить из БД
            employe = manager.find(2);
            System.out.println(employe);

            // Получить из кэша
            employe = manager.find(3);
            System.out.println(employe);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcConnection.disconnect();
        }
    }
}
