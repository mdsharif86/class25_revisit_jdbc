package class25_revisit_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example01 {

	public static void main(String[] args) throws SQLException {
		
		Connection conn;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmicrotech", "root", "root");
		
		Statement stmt;
		stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT* FROM TBLCUSTOMER");
		
		System.out.println(" custId\tcust Name\tcustName");
		while (rs.next()) {
			System.out.println(rs.getString("custId") + "\t" + rs.getString("CustName") + "\t"+ rs.getString("CustState"));
		}
	}//main

}//class
, 