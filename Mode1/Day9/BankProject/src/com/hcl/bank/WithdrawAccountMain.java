package com.hcl.bank;

import java.util.Scanner;

public class WithdrawAccountMain {
	public static void main(String[] args) {
		int accountNo,withdrawAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AccountNo ");
		accountNo=sc.nextInt();
		System.out.println("Enter withdrawAmount ");
		withdrawAmount=sc.nextInt();
		System.out.println(AccountBal.withdrawAccountBal(accountNo, withdrawAmount));
	}

}
