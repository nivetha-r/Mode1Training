package com.hcl.java;

public class EvenShow {
	
	public void show(int n){
		int i=0;
		while(i<n){
			i=i+2;
			System.out.println("even "+i);
		}
	}
	public static void main(String[] args) {
		int n=10;
		new EvenShow().show(n);
		
	}

}
