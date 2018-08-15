package umlDemo1;

public class SumMain {

	ClassA a1 = null;

	
	ClassB b1 = null;
	
	
	
	public static void main(String[] args, ClassA a1) {
		a1 = new ClassA();
		a1.setA(10);
		a1.setB(4);
		System.out.println(a1.sumab(10, 3));

		System.out.println("Hello");
		
	}

}
