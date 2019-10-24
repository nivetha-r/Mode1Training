package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployShow {
	public static void main(String[] args) {
		Connection con=DaoConnection.getConnection();
		String cmd="select * from Employ";
		try {
	   PreparedStatement pst = con.prepareStatement(cmd);
	   ResultSet rs=pst.executeQuery();
	   while(rs.next()) {
		   System.out.println("Empno " +rs.getInt("empno"));
		   System.out.println("Name " +rs.getString("name"));
		   System.out.println("Dept " +rs.getString("dept"));
		   System.out.println("Desig " +rs.getString("desig"));
		   System.out.println("Basic " +rs.getInt("basic"));
		   System.out.println("     ");
	   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	


