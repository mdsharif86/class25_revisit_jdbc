package class25_revisit_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Example03 {

	public static void main(String[] args) throws SQLException {
		
		Connection conn;
		conn = DriverManager.getConnection("jbdc:mysql://localhost:3306/dbmicrotech", "root", "root");
		
		Statement stmt;
		stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT* FROM tblemployee");
		
	//	System.out.println("empid\tempName\tempState\tempDOB\tempSalary\tempMarried\tmanagerId");
		
		while (rs.next()) {
			System.out.println(rs.getString("empId") + "\t" + rs.getString("empName") + "\t" + rs.getString("empState") );
		}
	}
	
}


