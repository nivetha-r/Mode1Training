package com.hcl.intf;

interface IOne{
	void name();
}
interface ITwo{
	void email();
}
class Test implements IOne,ITwo{

	@Override
	public void email() {
		System.out.println("email isghg6@gmail.com");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		System.out.println("hcl");
		// TODO Auto-generated method stub
		
	}
	
}
public class MultiInh {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.name();
		obj.email();
	}

}
