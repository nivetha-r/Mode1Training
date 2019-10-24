package com.hcl.abs;

abstract class Training{
	abstract void name();
	abstract void email();
}

class Nivetha extends Training{
@Override
void name() {
	System.out.println("Name is Nivetha");
}
	// TODO Auto-generated method stub
	


@Override
void email() {
	System.out.println("rnivetha197@gmail.com");
	// TODO Auto-generated method stub
	
}
}

class Nisha extends Training{

	@Override
	void name() {
		System.out.println("Name is Nisha");
	}
		// TODO Auto-generated method stub
		
	

	@Override
	void email() {
	System.out.println("nisha98@gmail.com");
		// TODO Auto-generated method stub
		
	}
}
public class AbsDemo{
	
	public static void main(String[] args) {
		//Training t1=new Nivetha();
		//Training t2=new Nisha();
	
		Training[] arr=new Training[]
				{
						new Nivetha(),
						new Nisha()
				};
	for (Training t : arr) {
		t.name();
		t.email();
	}
}
}