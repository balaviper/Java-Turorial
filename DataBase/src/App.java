import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        try{  

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String table = "testing";
            Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/"+table,"root","");  
              
            //step3 create the statement object  
            Statement stmt=con.createStatement();  
              
            //step4 execute query 
            //String sql = "INSERT INTO emp VALUES (2,'kamalesh',20)";
            //stmt.executeUpdate(sql); 
            ResultSet rs=stmt.executeQuery("select * from emp");  
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
              
            //step5 close the connection object  
            con.close();  
              
            }catch(Exception e){ System.out.println(e);}  
              
    }

}
