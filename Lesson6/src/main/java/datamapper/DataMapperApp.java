package datamapper;

import datamapper.dao.EmployeBuilder;
import datamapper.dao.EmployeDAO;
import datamapper.dao.JdbcConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class DataMapperApp {


    public static void main(String[] args) {

        try {
            EmployeDAO employeDAO = new EmployeDAO(JdbcConnection.getConnection());

            EmployeBuilder.Employe employe = employeDAO.getById(1);

            System.out.println(employe);

        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcConnection.disconnect();
        }

    }

}
