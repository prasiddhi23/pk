

import java.sql.*;

public class DBconnection {

    private static final String url = "jdbc:mysql://localhost:3306/bcis2"; // Corrected URL
    private static final String username = "root";
    private static final String password = "";

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Check if the connection is successful
            if (con != null) {
                System.out.println("Connection Successful");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        }
    }
}
