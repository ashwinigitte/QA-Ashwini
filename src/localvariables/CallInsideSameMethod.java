//we can call local variable of a method inside the same method directly 
//but can not call local variable of a method inside another method

package localvariables;

public class CallInsideSameMethod {
	
	public void method1() {
		int a=34;
		System.out.println(a);
	}
	public static void method2() {
		int a=89;
		System.out.println(a);
		
	}
	public void method3() {
		int c=67;
		System.out.println(c);
	}
	public static void main(String[] args) {
		CallInsideSameMethod obj=new CallInsideSameMethod();
		obj.method1();
		obj.method3();
		method2();
		
	}

}
