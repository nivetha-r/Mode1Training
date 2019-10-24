package com.hcl.java;

public class MaxNum {
	
	public void check(int a,int b,int c){
		if(a>b&&a>c){
			System.out.println("a is greatest");
		}
		if(b>c&&b>a){
			System.out.println("b is greatest");
		}
		if(c>a&&c>b){
			System.out.println("c is greatest");
		}
	}
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=20;
		c=30;
		new MaxNum().check(a, b, c);
	}
		
	}
