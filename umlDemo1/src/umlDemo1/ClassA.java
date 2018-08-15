package umlDemo1;

public class ClassA {
	
	int a;
	int b;
	

	
	public ClassA(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public ClassA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int sumab(int a, int b) {
		int c = a+b;
		return c;
	}
	
	

}
