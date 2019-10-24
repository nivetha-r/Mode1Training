package com.hcl.practice;



public class Attendance {
	
	public static void display(Object...ob) {
		for(Object object : ob) {
			System.out.print(object + " ");
		}
		System.out.println();
		
	}
	public static void show(int day,String...name){
		System.out.print(day + " ");
		for (String s : name) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

public static void main(String[] args) {
	show(1);
	show(2,"A","B");
	show(3,"C","D","E","f","G");
	show(4,"h","I","J");
	
	display();
	display("Ram",12,true,12.5);
}


}
