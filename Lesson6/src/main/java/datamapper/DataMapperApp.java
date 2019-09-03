package datamapper;

import datamapper.dao.EmployeDAO;
import datamapper.dao.JdbcConnection;

import java.sql.SQLException;

public class DataMapperApp {


    public static void main(String[] args) {

        try {
            EmployeDAO employeDAO = new EmployeDAO(JdbcConnection.getConnection());

        } catch(SQLException e) {}
    }







}
