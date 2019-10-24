package com.hcl.beans;

public class AccountBal {
	public static String WithdrawAccountBal(int accountNo,int WithdrawAmount){
		return new AccountDao().WithdrawAccountDao(accountNo, WithdrawAmount);
		
	}
	public static String depositAccountBal(int accountNo,int depositAmount) {
		return new AccountDao().depositAccountDao(accountNo, depositAmount);
		
		
	}
	public static String closeAccountBal(int accountNo){
		return new AccountDao().closeAccountDao(accountNo);
		
	}
	public static String updateAccountBal(int accountNo,String city,String state ) {
		return new AccountDao().updateAccountDao(accountNo,city,state);
		
	}
	public static Accounts searchAccountBal(int accountNo) {
		return new AccountDao().searchAccountDao(accountNo);
		
	}
	public static String createAccountBal(Accounts objAccounts) {
		return new AccountDao().createAccountDao(objAccounts);
		
		
	}

	public static int generateAccountBal(){
		return new AccountDao().generateAccountNoDao();
		
	}

}
