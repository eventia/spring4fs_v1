package chap02;

public class Greeter {

	private String format;

	public String greet(String guest) {
		return String.format(format, guest);
		// String.format("%s, 안녕하세요!", "스프링");
	}

	// setter 가 있어야만 한다.
	public void setFormat(String format) {
		this.format = format;
	}

}
