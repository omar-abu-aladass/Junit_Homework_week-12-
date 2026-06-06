package I3.DatabaseOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Creates SQLite database connections for the hotel management system.
 */
public class DataBaseConnection {

    private static final String DRIVER_CLASS = "org.sqlite.JDBC";
    private static final String DATABASE_URL = "jdbc:sqlite:hotel.sqlite";

    private DataBaseConnection() {
        // Utility class.
    }

    public static Connection connectTODB() {
        try {
            Class.forName(DRIVER_CLASS);
            return DriverManager.getConnection(DATABASE_URL);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage());
            return null;
        }
    }
}
