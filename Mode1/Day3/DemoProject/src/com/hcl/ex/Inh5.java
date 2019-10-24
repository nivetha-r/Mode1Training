package com.hcl.ex;

class c{
	int a,b;
	public c(){
		a=6;
		b=7;
	}
	@Override
	public final String toString() {
		return "c1 [a=" + a + ", b=" + b + "]";
	}
	
}
class d extends c{
	public d(int a,int b){
}
}

public class Inh5 {
    public static void main(String[] args) {
		d obj=new d(12, 5);
		System.out.println(obj);
	}
}
