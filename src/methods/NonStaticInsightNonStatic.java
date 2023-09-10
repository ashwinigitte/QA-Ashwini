package methods;

public class NonStaticInsightNonStatic {
	public void method1() {
		System.out.println("this is method1");
	}
	public void method2() {
		System.out.println("this is method2");
		method1();  //just calling 
	}
	public static void main(String[] args) {
		System.out.println("this is a main method");
		NonStaticInsightNonStatic obj=new NonStaticInsightNonStatic();//object creation
		obj.method2();
		
	}

}
