package com.hcl.intf;

 interface ITraining{
	 void name();
	 void email();
 }
 class Nivetha implements ITraining{

	@Override
	public void name() {
		System.out.println("Name is Nivetha");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void email() {
		System.out.println("email is rnivetha197@gmail.com");
		// TODO Auto-generated method stub
		
	}
	 
 }
 class Nisha implements ITraining{

	@Override
	public void name() {
		System.out.println("name is Nisha");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void email() {
		System.out.println("email is nisha676@gmail.com");
		// TODO Auto-generated method stub
		
	}
	 
 }
public class IntfDemo {
	public static void main(String[] args) {
		ITraining[] arr=new ITraining[]
				{
						new Nivetha(),
						new Nisha()
				};
		for (ITraining t : arr) {
			t.name();
			t.email();
		}
		}
}

