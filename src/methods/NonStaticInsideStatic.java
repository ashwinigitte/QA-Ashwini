package methods;

public class NonStaticInsideStatic {
	public void method() {
		System.out.println("this is a non-static method");
	
	}
	public static void method1() {
		System.out.println("this is a static method");
		NonStaticInsideStatic obj=new NonStaticInsideStatic();
		obj.method();
	}
	
	public static void main(String[] args) {
		System.out.println("this is a main method");
		method1();
		

	}

}
