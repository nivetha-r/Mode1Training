package com.hcl.java;

public class LoopDemo {
	
	public void show(int n){
		int i=0;
		while(i<n){
			System.out.println("welcome");
			i++;
		}
	}
	public static void main(String[] args) {
		int n=10;
		new LoopDemo().show(n);
		
	}

}
