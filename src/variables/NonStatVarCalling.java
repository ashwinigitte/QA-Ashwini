//calling non static variable inside static method object creation is mandatory

package variables;

public class NonStatVarCalling {

	int a=23;
	int b=67;//non static var
	
	public static void main(String[] args) {
		NonStatVarCalling obj=new NonStatVarCalling();
		int c=obj.a+obj.b;
		System.out.println(c);
	}
}
