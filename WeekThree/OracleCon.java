package WeekThree;

import java.sql.*; 
public class OracleCon{  
public static void main(String args[]){  
try{  
//step1 load the driver class  
Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/testing","root","");  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//step4 execute query  
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
//step5 close the connection object  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  