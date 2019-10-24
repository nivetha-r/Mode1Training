package com.hcl.java;

public class OddEven {
	
	public void check(int n){
		if(n%2==0){
			System.out.println("even no");
		}else{
			System.out.println("odd no");
		}
	}
	public static void main(String[] args) {
		int n=7;
		new OddEven().check(n);
	}
		

}
