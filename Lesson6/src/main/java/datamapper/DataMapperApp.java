package datamapper;

import datamapper.domain.EmployeBuilder;
import datamapper.dao.EmployeDAO;
import datamapper.dao.JdbcConnection;

import java.sql.SQLException;

public class DataMapperApp {

    public static void main(String[] args) {

        try {
            EmployeDAO employeDAO = new EmployeDAO(JdbcConnection.getConnection());

            EmployeBuilder.Employe employe = employeDAO.getById(3);
            System.out.println(employe);

            employe = employeDAO.getById(2);
            System.out.println(employe);

        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcConnection.disconnect();
        }

    }

}
