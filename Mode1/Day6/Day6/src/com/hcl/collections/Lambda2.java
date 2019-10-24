package com.hcl.collections;
@FunctionalInterface
interface IHello {
	void sayHello();
	
}
@FunctionalInterface
interface ICalc {
	int calc(int a,int b);
}

public class Lambda2 {
  
	public static void main(String[] args) {
		IHello h1 = () ->{
			System.out.println("Hello from Nive");
		};
		IHello h2 = () -> {
			System.out.println("Hello form nisha");
		};
		IHello h3= () -> {
			System.out.println("Hello form pichu");
		};
		IHello[] arr=new IHello[]{h1,h2,h3};
		for (IHello iHello : arr) {
			iHello.sayHello();
			
		}
		ICalc ad1=(a,b) -> {
			System.out.println("Sum ");
			return a+b;
		};
		ICalc ad2=(a,b) -> (a-b);
		ICalc ad3=(a,b) -> (a*b);	
 
		System.out.println(ad1.calc(24, 56));
		System.out.println(ad2.calc(24, 56));
		System.out.println(ad3.calc(24, 56));
		//h1.sayHello();
		//h2.sayHello();
		//h3.sayHello();
		
	}
}
