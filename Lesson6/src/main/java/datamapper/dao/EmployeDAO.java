package datamapper.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeDAO {
    private final String QUERY_BY_ID = "select * from employes where id=?";

    private Connection connection = null;

    public EmployeDAO(Connection connection) {
        this.connection = connection;
    }

    public EmployeBuilder.Employe getById(int id) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(QUERY_BY_ID)){

            statement.setInt(1, id);

            try(ResultSet rs = statement.executeQuery()){
                if(rs != null && rs.next()) {
                    return new EmployeBuilder()
                            .id(rs.getInt(1))
                            .lastName(rs.getString(2))
                            .firstName(rs.getString(3))
                            .age(rs.getInt(4))
                            .salary(rs.getInt(5))
                            .build();
                }
            }

        }
        throw new RuntimeException("Unexpected error");
    }

}
