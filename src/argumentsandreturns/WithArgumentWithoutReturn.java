package argumentsandreturns;

public class WithArgumentWithoutReturn {
	
	public void show(double d) {
		System.out.println("with argument without return");
		System.out.println(d);
		
	}
	public static void display(float f) {
		System.out.println("static method with argument without returns");
	}

	public static void main(String[] args) {
		WithArgumentWithoutReturn obj=new WithArgumentWithoutReturn();
		obj.show(4.45);
		display(0.45f);
		
	}
}
