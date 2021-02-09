package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDAO {
     public static void main(String[] args) {}
    
   String jdbcURL = "jdbc:mysql://localhost:3306/proje";
   String jdbcUsername = "root";
   String jdbcPassword = "batuhan";

   String INSERT_USERS_SQL = "INSERT INTO personel" + "  (isim, email, telefon) VALUES " +
        " (?, ?, ?);";

   String SELECT_USER_BY_ID = "select id,isim,email,telefon from personel where id =?";
   String SELECT_ALL_USERS = "SELECT * FROM personel";
   String DELETE_USERS_SQL = "delete from personel where id = ?;";
   String UPDATE_USERS_SQL = "update personel set isim = ?,email= ?, telefon =? where id = ?;";
   String CHECK_PERSONEL_SQL =  "SELECT * FROM personel WHERE email = ? and id = ?";

    public UserDAO() {}

    protected Connection getConnection() {
        Connection connection = null;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
        }
        return connection;
    }

    public void insertUser(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
      
       
        try (           
            Connection connection = getConnection();                                
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, user.getIsim());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setInt(3, user.getTelefon());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public User selectUser(int id) {
        User user = null;
        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String isim = rs.getString("isim");
                String email = rs.getString("email");
                int telefon = rs.getInt("telefon");
                user = new User(id, isim, email, telefon);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
    }

    public List<User> selectAllUsers() {
        List<User> listUser = new ArrayList<> ();
       
        try (Connection connection = getConnection();
          
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
       
            ResultSet rs = preparedStatement.executeQuery();
        
            while (rs.next()) {
                int id = rs.getInt("id");
                String isim = rs.getString("isim");
                String email = rs.getString("email");
                int telefon = rs.getInt("telefon");
                User user = new User(id, isim, email, telefon);
			listUser.add(user);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return listUser;
    }

    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, user.getIsim());
            statement.setString(2, user.getEmail());
            statement.setInt(3, user.getTelefon());
            statement.setInt(4, user.getId());
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
    
    public User checkLogin(String email, int id) throws SQLException,
            ClassNotFoundException {
        
 
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(CHECK_PERSONEL_SQL);
        preparedStatement.setString(1, email);
        preparedStatement.setInt(2, id);
 
        ResultSet result = preparedStatement.executeQuery();
 
        User user = null;
 
        if (result.next()) {
            user = new User();
            user.setId(id);
            user.setEmail(email);
        }
 
    
 
        return user;
    }
    
    
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}