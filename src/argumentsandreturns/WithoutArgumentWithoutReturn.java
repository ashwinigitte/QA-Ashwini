package argumentsandreturns;

public class WithoutArgumentWithoutReturn {
	
	public void show() {
		System.out.println("without argument and without return type");
	}
	
	public static void display() {
		System.out.println("static method without argument and without return type ");
	}

	public static void main(String[] args) {
		WithoutArgumentWithoutReturn obj=new WithoutArgumentWithoutReturn();
		obj.show();
		display();
	}
}
