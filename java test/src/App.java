import java.sql.*;
import java.util.*;

public class App {
  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost/registration";

  // Database credentials
  static final String USER = "username";
  static final String PASS = "password";

  /**
 * @param args
 */
public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try {
      // Register JDBC driver
      Class.forName(JDBC_DRIVER);

      // Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      // Create a statement
      stmt = conn.createStatement();
      String sql;

      // Prompt user for registration information
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = input.nextLine();
      System.out.print("Enter your email: ");
      String email = input.nextLine();
      System.out.print("Enter your password: ");
      String password = input.nextLine();

      // Insert user information into database
      System.out.println("Inserting user information into database...");
      sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, name);
      pstmt.setString(2, email);
      pstmt.setString(3, password);
     

      // Print confirmation message
      System.out.println("Registration successful!");

      // Clean-up environment
      pstmt.close();
      stmt.close();
      conn.close();
    } catch(SQLException se) {
      // Handle errors for JDBC
      se.printStackTrace();
    } catch(Exception e) {
      // Handle errors for Class.forName
      e.printStackTrace();
    } finally {
      // Finally block used to close resources
      try {
        if (stmt!=null) stmt.close();
      } catch(SQLException se2) {
      } // nothing we can do
      try {
        if (conn!=null) conn.close();
      } catch(SQLException se) {
        se.printStackTrace();
      }
    }
  }
}