package completedProject;
import java.sql.*;
public class Baglantimiz {


 static Connection conn;
 
 public void coktanEkle(String sorgu,String url) {
	
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String userName = "root";
	String password = "";
	
	try {
	Class.forName(driver).newInstance();
	conn = DriverManager.getConnection(url,userName,password);
	System.out.println("Ba�lan�ld�");
	 Statement stmt=conn.createStatement(); 
     stmt.executeUpdate(sorgu);
     conn.close();
     System.out.println("Kay�t Eklendi");
     
	}
	catch(ClassNotFoundException e) {
	e.printStackTrace();
	}
catch(SQLException e) {
e.printStackTrace();
}
catch (Exception e) {
e.printStackTrace();
}
	
}	
 
 public static ResultSet coktanlistele(String query,String url) {
	 ResultSet rs=null;
	 
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String password = "";
		
		try {
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url,userName,password);
		System.out.println("Veritaban�na Ba�lan�ld�");
		Statement stmt=conn.createStatement(); 
		rs =stmt.executeQuery(query);
		
	    
		}
		
		catch(ClassNotFoundException e) {
		e.printStackTrace();
		}
	catch(SQLException e) {
	e.printStackTrace();
	}
	catch (Exception e) {
	e.printStackTrace();
	}

		return rs;
 }
 
 }
 
