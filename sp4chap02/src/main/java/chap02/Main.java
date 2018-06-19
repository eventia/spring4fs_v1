package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		// System.out.println("ctx = " + ctx);
		
		Greeter g = ctx.getBean("greeter", Greeter.class);
		// System.out.println("g = " + g);
		
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}
}
