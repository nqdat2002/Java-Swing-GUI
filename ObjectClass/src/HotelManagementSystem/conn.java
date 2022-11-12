package HotelManagementSystem;


import java.sql.*;

public class conn {

	Connection c;
	Statement s;
	
	public conn() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/htm","root","datnq123");
			s = (Statement)c.createStatement();		
			// int result = s.executeUpdate("CREATE DATABASE databasename");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
            new conn();
	}
}
