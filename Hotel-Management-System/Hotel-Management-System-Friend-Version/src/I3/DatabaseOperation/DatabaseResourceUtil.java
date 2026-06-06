package I3.DatabaseOperation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Utility methods for safely closing JDBC resources.
 */
final class DatabaseResourceUtil {

    private DatabaseResourceUtil() {
        // Utility class.
    }

    static void closeQuietly(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                System.err.println(ex.toString() + " >> CLOSING RESULT SET");
            }
        }
    }

    static void closeQuietly(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.err.println(ex.toString() + " >> CLOSING STATEMENT");
            }
        }
    }

    static void closeQuietly(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.err.println(ex.toString() + " >> CLOSING CONNECTION");
            }
        }
    }
}
