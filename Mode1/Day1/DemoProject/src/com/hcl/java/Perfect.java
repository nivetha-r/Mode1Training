package com.hcl.java;

public class Perfect {
	
	public void check(int n){
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
				System.out.println("perfect");
			}else{
				System.out.println("not perfect");
		}
	}
	public static void main(String[] args) {
		int n=10;
		new Perfect().check(n);
	}


}
