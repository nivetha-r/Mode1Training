package p1;

public class Nive {
	public int empno=1;
	private String name="ttt";
	protected String city="yyy";
	double basic=56552;
	
	public void show(){
		Nive obj=new Nive();
		System.out.println(obj.basic);
		System.out.println(obj.city);
		System.out.println(obj.empno);
		System.out.println(obj.name);
	}

}
