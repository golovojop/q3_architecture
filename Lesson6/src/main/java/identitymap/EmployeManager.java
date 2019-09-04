package identitymap;

import datamapper.EmployeDAO;
import domain.Employe;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

public class EmployeManager {

    private Connection connection;
    private HashMap<Integer, Employe> map;

    public EmployeManager(Connection connection) {
        this.connection = connection;
        this.map = new HashMap<>();
    }

    public Employe find(int id) throws SQLException {
        if(map.containsKey(id)) {
            System.out.println("Object from cash:");
            return map.get(id);
        } else {
            System.out.println("Object from DB:");
            Employe employe = EmployeDAO.getById(connection, id);
            map.put(id, employe);
            return employe;
        }
    }
}
