package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {
	public static void main(String[] args) {
		int accountNo,depositAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AccountNo ");
		accountNo=sc.nextInt();
		System.out.println("Enter depositAmount ");
		depositAmount=sc.nextInt();
		System.out.println(AccountBal.depositAccountBal(accountNo,depositAmount));
		
	}

}
