package com.hcl.nive;

enum Student{
	Nivetha,Nisha,Nishanth,Rajamani,Soundari
}

public class Enum3 {
	
	public static void show(){
		Student[] arrStudent=Student.values();
		for (Student student : arrStudent){
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		show();
	}

}
