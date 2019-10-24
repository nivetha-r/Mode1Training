package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptUpdate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int deptno;
		String dname,loc,head;
		System.out.println("Enter deptno ");
		deptno=sc.nextInt();
		System.out.println("Enter dept name ");
		dname=sc.next();
		System.out.println("Enter location ");
		loc=sc.next();
		System.out.println("Enter Head ");
		head=sc.next();
		String cmd="update Department set dname=?,loc=?,head=? WHERE deptno=? ";
		Connection con=DaoConnection.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setString(1, dname);
			pst.setString(2, loc);
			pst.setString(3, head);
			pst.setInt(4, deptno);
			pst.executeUpdate();
			System.out.println("record updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



