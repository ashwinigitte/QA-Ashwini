package argumentsandreturns;

public class WithArgumentWithReturn {
	
	public int show(boolean b) {//this return type e.g-int and return value e.g-500 shld be of same datatype
		return 500;             //here no need that boolean b and 500 shld be of same datatype
	}
	
	public static float display(char a) {
		return 4.56f;
		
	}

	public static void main(String[] args) {
		WithArgumentWithReturn obj=new WithArgumentWithReturn();
		System.out.println(obj.show(false));//datatype of false is boolean so it prints the method which hs argument as boolean
		System.out.println(('a'));
	}
}
