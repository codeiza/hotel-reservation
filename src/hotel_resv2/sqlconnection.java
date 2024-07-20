/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_resv2;

/**
 *
 * @author Zo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sqlconnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/hotel_reservationdb";
    private static final String USERNAME = "root"; // Enter your MySQL username here
    private static final String PASSWORD = ""; // Enter your MySQL password here

    public static void main(String[] args) {
        try {
            // Attempt to establish a connection
            Connection connection = getConnection();

            // Connection successful
            System.out.println("Connected to the database!");

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            // Connection failed
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }

    public static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
