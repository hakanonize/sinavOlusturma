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
	System.out.println("Baðlanýldý");
	 Statement stmt=conn.createStatement(); 
     stmt.executeUpdate(sorgu);
     conn.close();
     System.out.println("Kayýt Eklendi");
     
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
		System.out.println("Veritabanýna Baðlanýldý");
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
 
