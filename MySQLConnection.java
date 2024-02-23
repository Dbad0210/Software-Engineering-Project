// ChatGPT Generated Code
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/SoftwareProject";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            // Register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            if (connection != null) {
                System.out.println("Connected to the database!");

                // Perform database operations here

                // Close the connection
                connection.close();
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check output console");
            e.printStackTrace();
        }
    }
}
