package com.hcl.java;

public class Switch2 {
	
	public void check(String opt){
		
		switch(opt.toUpperCase()){

		case "INSERT":
			System.out.println("insert operation");
			break;
		case "UPDATE":
			System.out.println("update operation");
			break;
		case "DELETE":
			System.out.println("delete operation");
			break;
		default:
			System.out.println("invalid operation");
			break;
			
		}
	}
	public static void main(String[] args) {
		String op="INSeRT";
		new Switch2().check(op);
		
	}

}
