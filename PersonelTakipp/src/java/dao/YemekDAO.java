 package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Yemek;


    public class YemekDAO {
    public static void main(String[] args) {}
    
   String jdbcURL = "jdbc:mysql://localhost:3306/proje";
   String jdbcUsername = "root";
   String jdbcPassword = "batuhan";
   
   String SELECT_ALL_YEMEKS = "SELECT * FROM yemek";
   String UPDATE_YEMEKS_SQL = "UPDATE yemek SET corba = ?,anayemek= ?, anayemek2 =? WHERE gun = ?;";
   String SELECT_YEMEK_BY_GUN = "select gun,corba,anayemek,anayemek2 from yemek where gun =?";
   public YemekDAO() {}
   
   
   protected Connection getConnection() {
        Connection connection = null;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } 
        catch (SQLException | ClassNotFoundException e) {
        }
        return connection;
    }
   
        public List<Yemek> selectAllYemeks() {
        List<Yemek> listYemek = new ArrayList<> ();
       
        try (Connection connection = getConnection();
          
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_YEMEKS);) {
            System.out.println(preparedStatement);
       
            ResultSet rs = preparedStatement.executeQuery();
        
            while (rs.next()) {
                String gun = rs.getString("gun");
                String corba = rs.getString("corba");
                String anayemek = rs.getString("anayemek");
                String anayemek2 = rs.getString("anayemek2");
                Yemek yemek = new Yemek(gun, corba, anayemek, anayemek2);
			listYemek.add(yemek);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return listYemek;
    }

            public Yemek selectYemek(String gun) {
                Yemek yemek = null;
                try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_YEMEK_BY_GUN);) {
                preparedStatement.setString(1, gun);
                System.out.println(preparedStatement);
                ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String corba = rs.getString("corba");
                String anayemek = rs.getString("anayemek");
                String anayemek2 = rs.getString("anayemek2");
                yemek = new Yemek(gun, corba, anayemek, anayemek2);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return yemek;
    }
   
        public boolean updateYemek(Yemek yemek) throws SQLException {
        boolean rowUpdatedd;
        try (Connection connection = getConnection(); 
            PreparedStatement statementt = connection.prepareStatement(UPDATE_YEMEKS_SQL);) {
            statementt.setString(1, yemek.getCorba());
            statementt.setString(2, yemek.getAnayemek());
            statementt.setString(3, yemek.getAnayemek2());
            statementt.setString(4, yemek.getGun());
            rowUpdatedd = statementt.executeUpdate() > 0;
        }
        return rowUpdatedd;
    }
    private void printSQLException(SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
