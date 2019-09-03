package datamapper.dao;

import com.sun.istack.internal.Nullable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private static Connection connection = null;
    private static String url = "jdbc:sqlite:lesson6.db";

    private static @Nullable Connection connect() throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return null;
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static @Nullable Connection getConnection() throws SQLException {
        if(connection != null) {
            return connection;
        } else {
            return connect();
        }
    }
}
