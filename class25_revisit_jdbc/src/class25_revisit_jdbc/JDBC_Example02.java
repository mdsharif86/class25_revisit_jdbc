package class25_revisit_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Example02 {
	
	public static void main(String[] args)  {
		
		Connection conn=null;
		Statement stmt = null;
		
		String url = "jdbc:mysql://localhost:3306/dbmicrotech";
		String user = "root";
		String password = "root";
				
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT* FROM TBLPRODUCT");
			System.out.println("prodId\tprodName\tprodPrice");
			while (rs.next()) {
				System.out.println(rs.getString("prodId")+ "\t"+ rs.getString("prodName")+ rs.getString("prodName"));
			}
		} catch (Exception e) {
			System.out.println("not connected");
		}
		
		
		
		
	
	}
}
