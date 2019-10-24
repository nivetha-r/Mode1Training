package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		int accountNo=AccountBal.generateAccountBal();
		//System.out.println(accountNo);
		Accounts objAccounts=new Accounts();
		objAccounts.setAccountNo(accountNo);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name ");
		objAccounts.setFirstName(sc.nextLine());
		System.out.println("Enter Last Name ");
		objAccounts.setLastName(sc.nextLine());
		System.out.println("Enter City ");
		objAccounts.setCity(sc.nextLine());
		System.out.println("Enter State ");
		objAccounts.setState(sc.nextLine());
		System.out.println("Enter Amount ");
		objAccounts.setAmount(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter CheqFacil ");
		objAccounts.setCheqFacil(sc.nextLine());
		System.out.println("Enter AccountType ");
		objAccounts.setAccountType(sc.nextLine());
		System.out.println(AccountBal.createAccountBal(objAccounts));
		
		
	}

}
