package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpShow1 {
	public static void main(String[] args) {
		int empno;
		System.out.println("Enter Employ no ");
		Scanner sc=new Scanner(System.in);
		empno=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			//System.out.println("connected");
			String cmd="select * from Emp where empno=?";
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1,empno );
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println(" ");
				System.out.println("Employ no  " +rs.getInt("empno"));
				System.out.println("EmployName  " +rs.getString("ename"));
				System.out.println("job   " +rs.getString("job"));
				System.out.println("mgr  " +rs.getInt("mgr"));
				System.out.println("hiredate  " +rs.getDate("hiredate"));
				System.out.println("sal  " +rs.getInt("sal"));
				System.out.println("comm  " +rs.getInt("comm"));
				System.out.println("dept num  " +rs.getInt("deptno"));
				
			}else{
				System.out.println("not found");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}





