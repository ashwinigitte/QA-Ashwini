package methods;

public class StaticInsideNonStatic {
	public static void method1() {
		System.out.println("aaaa");
	}
	public void method2() {
		System.out.println("this is a non static method");
		method1();
		
	}
	public static void main (String[] args) {
		System.out.println("bbbb");
		StaticInsideNonStatic obj=new StaticInsideNonStatic();
		obj.method2();
		
	}

}
