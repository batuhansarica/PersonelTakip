package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Admin;


public class AdminDAO {
    
     public static void main(String[] args) {}
     
    String jdbcURL = "jdbc:mysql://localhost:3306/proje";
    String jdbcUsername = "root";
    String jdbcPassword = "batuhan";
    String CHECK_ADMIN_SQL =  "SELECT * FROM admin WHERE kadi = ? and password = ?";
  
    protected Connection getConnection() {
        Connection connection = null;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
        }
        return connection;
    }
    
    
    public Admin checkLogin(String kadi, String password) throws SQLException,
            ClassNotFoundException {
        
 
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(CHECK_ADMIN_SQL);
        preparedStatement.setString(1, kadi);
        preparedStatement.setString(2, password);
 
        ResultSet result = preparedStatement.executeQuery();
 
        Admin admin = null;
 
        if (result.next()) {
            admin = new Admin();
            admin.setKadi(kadi);
            admin.setPassword(password);
        }
        return admin;
    }

    
    
}
