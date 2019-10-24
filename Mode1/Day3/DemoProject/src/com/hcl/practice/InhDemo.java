package com.hcl.practice;

class First
{
	public void show(){
		System.out.println("show method from class first");
	}
}
class Second extends First{
	public void show(){
		
	System.out.println("show method from class second");
}
}
public class InhDemo {
 public static void main(String[] args) {
//	First obj=new First();
	//obj.show();
	 First ob1=new First();
	 Second obj2=new Second();
 //Second f3=(Second)obj1;
 //f3.show();
	// First f2=(Second)obj2;
	 //f2.show();
}

}