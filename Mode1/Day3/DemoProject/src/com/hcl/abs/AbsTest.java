package com.hcl.abs;

 abstract class Animal{
    abstract void name();
    abstract void type();
    }
    
    class Lion extends Animal{

		@Override
		void name() {
			System.out.println("name is lion");
			// TODO Auto-generated method stub
			
		}

		@Override
		void type() {
			System.out.println("its wild animal");
			// TODO Auto-generated method stub
			
		}
    	
    }
    
    class Dog extends Animal{
 
		@Override
		void name() {
			System.out.println("name is dog");
			// TODO Auto-generated method stub
			
		}

		@Override
		void type() {
			System.out.println("its domestic animal");
			// TODO Auto-generated method stub
			
		}
    	
  
    }

public class AbsTest {
	public static void main(String[] args) {
		Animal[] arr=new Animal[]{
				new Lion(),
				new Dog()
		};
		for (Animal animal : arr) {
			animal.name();
			animal.type();
		}
		}
			
		}
			
