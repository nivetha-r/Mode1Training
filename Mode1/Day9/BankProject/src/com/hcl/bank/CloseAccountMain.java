package com.hcl.bank;

import java.util.Scanner;

public class CloseAccountMain {
	public static void main(String[] args) {
		int accountNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AccountNo ");
		accountNo=sc.nextInt();
		System.out.println(AccountBal.closeAccountBal(accountNo));
	}

}
