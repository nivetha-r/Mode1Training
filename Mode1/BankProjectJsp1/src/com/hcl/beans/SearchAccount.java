package com.hcl.beans;


public class SearchAccount {
	private int accountNo;
	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public Accounts searchAccount() {
		return AccountBal.searchAccountBal(accountNo);
	}

}
