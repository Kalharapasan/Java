package MySqlConnect;

import java.sql.*;

import javax.swing.JOptionPane;

public class main {
	Connection conn =null;
    public static Connection ConnecDB() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/studenttext","root","kalharamax");
			System.out.println("DB Connect");			
			return conn;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
    	
		
		
	}
	
	public static void main(String[] args) {
		ConnecDB();
		
	}

}
