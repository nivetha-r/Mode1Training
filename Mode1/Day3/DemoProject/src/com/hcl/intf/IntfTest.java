package com.hcl.intf;

interface IFirst{
	default void name(){
		System.out.println("name from ifirst");
	}
}
interface ISecond{
	default void name(){
		System.out.println("name from isecond");
	}
}
interface IThird{
	default void name(){
		System.out.println("name from ithird");
	}
}
class Demo implements IFirst,ISecond,IThird{

	@Override
	public void name() {
		IFirst.super.name();
		ISecond.super.name();
		IThird.super.name();
		
		
		// TODO Auto-generated method stub
		
	}
	
}
public class IntfTest {
     public static void main(String[] args) {
		new Demo().name();
	}
}










