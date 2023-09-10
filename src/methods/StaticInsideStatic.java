package methods;

public class StaticInsideStatic {
	public static void m1() {
		System.out.println("aaaa");
	}
	public static void m2() {
		System.out.println("cccc");
		m1();
	}
	
	public static void main (String[] args) {
		System.out.println("bbbb");
		m2();
		
	}

}
