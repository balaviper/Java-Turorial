package database;

import java.sql.*;

import entities.User;

public class DataRepository {
    
    public Connection createConnection(String database){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/"+database,"root","");
            return con; 
            
        }catch(Exception e){
             System.out.println(e);
             return null;
        }     
    }

    public void getAllData(String database, String tablename) throws SQLException{
        Connection con = createConnection(database);
        Statement stmt= con.createStatement();  
        String query = "select * from ".concat(tablename);
        ResultSet rs=stmt.executeQuery(query);  
        stmt.setCursorName(tablename);
        while(rs.next())  
        System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));     
        //step5 close the connection object  
        con.close();  
          
    }

    public void addData(String database, String tablename, User u) {
        try {
            Connection con = createConnection(database);
            String sql = "INSERT INTO "+tablename+" VALUES(?,?,?,?,?)";
            PreparedStatement stmt= con.prepareStatement(sql); 
            stmt.setString(1, u.getUsername());
            stmt.setString(2, u.getEmailid());
            stmt.setString(3, u.getPassword());
            stmt.setString(4, u.getUpiAccount());
            stmt.setInt(5, u.getWalletbalance());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public User getUser(String tablename, String userName){
        try {
            Connection con = createConnection("opps_project");
            String query = "select * from ".concat(tablename)+" where username = ?";
            PreparedStatement stmt= con.prepareStatement(query);
            stmt.setString(1, userName);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
            User temp = new User(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getInt(5));
            return temp;
            }
            return null;
        } catch (Exception e) {
            System.out.println(e+"getUsers");
            return null;
        }
    }

    public void updateBalance(String database, User u){
        try {
            Connection con = createConnection(database);
            String sql = "UPDATE user SET balance = ? WHERE username = ?";
            PreparedStatement stmt= con.prepareStatement(sql); 
            stmt.setInt(1, u.getWalletbalance());
            stmt.setString(2, u.getUsername());
            stmt.executeUpdate();
            System.out.println("Amount added successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
