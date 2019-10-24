package com.hcl.bank;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
public class AccountsTestCase {
	@Test
	public void testWithdrawAccount() {
		assertEquals("Amount Debited...", AccountBal.withdrawAccountBal(3, 3000));
		assertEquals("Insufficient Funds...", AccountBal.withdrawAccountBal(3, 300000));
		assertEquals("Account No not Found...", AccountBal.withdrawAccountBal(-3, 300000)); 
		assertEquals("Account Closed...", AccountBal.withdrawAccountBal(1, 300));
		
	}
	@Test
	public void testDepositaccount(){
		assertEquals("Amount Credited...", AccountBal.depositAccountBal(3, 3000));
		assertEquals("Account No not Found...", AccountBal.depositAccountBal(-3, 3000));
		assertEquals("Account Closed", AccountBal.depositAccountBal(1, 3000));
	}
	@Test
	public void testCloseAccount(){
		assertEquals("Account Closed", AccountBal.closeAccountBal(4));
		assertEquals("Account No not Found...", AccountBal.closeAccountBal(-4));
	}

	
	@Test
	public void testUpdateAccount() {
		assertEquals("Account Updated...",AccountBal.updateAccountBal(2, "chennai", "tamilnadu"));
		assertEquals("Account no not found...",AccountBal.updateAccountBal(-2, "chennai", "tamilnadu"));
		assertEquals("Account Closed Already...",AccountBal.updateAccountBal(1, "chennai", "tamilnadu"));
	}
	@Test
	public void testSearchAccount(){
		assertNotNull(AccountBal.searchAccountBal(1));
		assertNull(AccountBal.searchAccountBal(-1));
	}
	@Test
	public void testCreateAccount() {
		Accounts objAccounts=new Accounts();
		int accno=AccountBal.generateAccountBal();
		objAccounts.setAccountNo(accno);
		objAccounts.setFirstName("Nive");
		objAccounts.setLastName("pichu");
		objAccounts.setCity("vellore");
		objAccounts.setState("tamilnadu");
		objAccounts.setAmount(678676);
		objAccounts.setCheqFacil("yes");
		objAccounts.setAccountType("savings");
		assertEquals("Account created successfully..",AccountBal.createAccountBal(objAccounts));
	}
	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	@Test
	public void testGenerateAccountNo() {
		int accno=0;
		Connection con=DaoConnection.getConnection();
		String cmd="select max(accountNo)+1 accno from Accounts";
		try {
			 PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(accno, AccountBal.generateAccountBal());
	}

	@Test
	public void testGettersAndSetters() {
		Accounts objAccounts=new Accounts();
		objAccounts.setAccountNo(1);
		objAccounts.setFirstName("Nive");
		objAccounts.setLastName("pichu");
		objAccounts.setCity("vellore");
		objAccounts.setState("tamilnadu");
		objAccounts.setAmount(678676);
		objAccounts.setCheqFacil("yes");
		objAccounts.setAccountType("savings");
		objAccounts.setStatus("active");
		
		assertEquals(1,objAccounts.getAccountNo());
		assertEquals("Nive", objAccounts.getFirstName());
		assertEquals("pichu", objAccounts.getLastName());
		assertEquals("vellore", objAccounts.getCity());
		assertEquals("tamilnadu", objAccounts.getState());
	    assertEquals(678676, objAccounts.getAmount());
	    assertEquals("yes", objAccounts.getCheqFacil());
	    assertEquals("savings", objAccounts.getAccountType());
		assertEquals("active", objAccounts.getStatus());
	}

}
