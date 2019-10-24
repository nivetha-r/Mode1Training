package com.hcl.leave;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {
	private int emp_id;
	private String secretCode;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getSecretCode() {
		return secretCode;
	}
	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}
	public static boolean authenticate(int user,String pwd) {
		Connection con=DaoConnection.getConnection();
		String cmd="select * from employlogin where emp_id=? AND secretcode=?";
		boolean flag= true;
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, user);
		pst.setString(2, pwd);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			flag=true;
		}else{
			flag=false;
		}
	}

}
