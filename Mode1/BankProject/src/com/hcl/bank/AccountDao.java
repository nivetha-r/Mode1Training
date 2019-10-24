package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AccountDao {
	PreparedStatement pst;
	Connection con;
	public String WithdrawAccountDao(int accountNo,int WithdrawAmount) {
		con=DaoConnection.getConnection();
		String result=" ";
		Accounts objAccounts=searchAccountDao(accountNo);
		if(objAccounts!=null) {
			int amount=objAccounts.getAmount();
			String status=objAccounts.getStatus();
			if(status.equalsIgnoreCase("inactive")) {
				result="Account Closed...";
			}else{
			
			if(amount-WithdrawAmount >=1000){
				String cmd="update Accounts set amount=amount-? where AccountNo=? ";
				try {
					pst=con.prepareStatement(cmd);
					pst.setInt(1, WithdrawAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd="Insert into Trans(AccountNo,TransAmount,TransType) values(?,?,?) ";
					pst=con.prepareStatement(cmd);
					pst.setInt(1,WithdrawAmount);
					pst.setInt(2, accountNo);
					pst.setString(3, "D");
					pst.executeUpdate();
					result="Amount Debited...";		
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result=e.getMessage();
				}
				}else{
				result="Insufficient Funds...";
				}
			
			}
		}else{
				result="Account No not Found...";
			}
		return result;
		}
	public String depositAccountDao(int accountNo,int depAmount) { 
		con=DaoConnection.getConnection();
		String result=" ";
		String cmd="update Accounts set amount=amount+? where AccountNo=? ";
		Accounts objAccounts=searchAccountDao(accountNo);
		if(objAccounts==null) {
			result="Account No not Found...";
		}else{
			String status=objAccounts.getStatus();
			if(status.equalsIgnoreCase("inactive")) {
				result="Account Closed";
			}else{
		
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, depAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd="Insert into Trans(AccountNo,TransAmount,TransType) values(?,?,?) ";
			pst=con.prepareStatement(cmd);
			pst.setInt(1,accountNo);
			pst.setInt(2, depAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			result="Amount Credited...";		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		}
		}
		return result;
	}
	
	public String closeAccountDao(int accountNo ) {
		con=DaoConnection.getConnection();
		String result=" ";
		Accounts objAccounts=searchAccountDao(accountNo);
		if(objAccounts==null) {
			result="Account No not Found...";
		}else{
			String cmd="update Accounts set status='inactive' where AccountNo=?";
		
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			result="Account Closed";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
			
		}
		
	}
		return result;
	}
	public String updateAccountDao(int accountNo,String city,String state) {
		con=DaoConnection.getConnection();
		Accounts objAccounts=searchAccountDao(accountNo);
		String cmd="update Accounts set City=?, state=? Where AccountNo=? ";
		String result=" ";
		if(objAccounts==null) {
			result="Account no not found...";
		}else{
			String status=objAccounts.getStatus();
			if(status.equals("inactive")) {
				result="Account Closed Already...";
			}else {
				
			
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, city);
			pst.setString(2, state);
			pst.setInt(3, accountNo);
			pst.executeUpdate();
			result="Account Updated...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
			
		}
		
	}
		}
		return result;
	}
	public Accounts searchAccountDao(int AccountNo) {
		con=DaoConnection.getConnection();
		String cmd=" select * from accounts where AccountNo=?";
		Accounts objAccounts=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, AccountNo);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				objAccounts=new Accounts();
				objAccounts.setFirstName(rs.getString("firstName"));
				objAccounts.setLastName(rs.getString("lastName"));
				objAccounts.setCity(rs.getString("city"));
				objAccounts.setState(rs.getString("state"));
				objAccounts.setAmount(rs.getInt("Amount"));
				objAccounts.setCheqFacil(rs.getString("CheqFacil"));
				objAccounts.setAccountType(rs.getString("AccountType"));
				objAccounts.setStatus(rs.getString("status"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objAccounts;
		
		
	}
	public String createAccountDao(Accounts objAccounts) {
		con=DaoConnection.getConnection();
		String cmd="Insert into Accounts(AccountNo,FirstName," + "LastName,City,State,Amount,CheqFacil," +"AccountType)values(?,?,?,?,?,?,?,?)";
		String result=" ";
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, objAccounts.getAccountNo());
			pst.setString(2, objAccounts.getFirstName());
			pst.setString(3, objAccounts.getLastName());
			pst.setString(4, objAccounts.getCity());
			pst.setString(5, objAccounts.getState());
			pst.setInt(6, objAccounts.getAmount());
			pst.setString(7, objAccounts.getCheqFacil());
			pst.setString(8, objAccounts.getAccountType());
			pst.executeUpdate();;
			result="Account created successfully..";
		   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		return result;
		
	}
	public int generateAccountNoDao(){
		con=DaoConnection.getConnection();
		int accno=0;
		String cmd=" select case when max(accountNo) is null "+ " then 1 else max(accountNo)+1 end accno "+" from accounts ";
		try {
			pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accno;
	}
	

}
