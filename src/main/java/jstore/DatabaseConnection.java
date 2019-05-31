package jstore;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection
{
    public static Connection connection() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jstore",
                            "postgres", "equi0047");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
