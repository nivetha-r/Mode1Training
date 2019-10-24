package com.hcl.Threads;



class Data {
	synchronized void dispMsg(String name) {
		System.out.print("Hello  " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("  How are u....");
		
	}
}
class Uttam extends Thread {
	Data d;
	Uttam(Data d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.dispMsg("Uttam");
		
	}
}
class Laksh extends Thread {
	Data d;
	Laksh(Data d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.dispMsg("Laksh");
	}
}
class Hema extends Thread {
	Data d;
	Hema(Data d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.dispMsg("Hema");
	}
}

public class SyncEx {
	public static void main(String[] args) {
		Data d=new Data();
		Uttam obj1=new Uttam(d);
		Laksh obj2=new Laksh(d);
		Hema obj3=new Hema(d);
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
