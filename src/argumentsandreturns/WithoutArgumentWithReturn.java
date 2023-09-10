package argumentsandreturns;

public class WithoutArgumentWithReturn {
	
	public byte show() {
		return 8;
	}
	public long go() {
		return 7777l;
	}
	public short m1() {
		return 110 ;
	}
	public char m2() {
		return '9';
	}
	
	
	public static boolean display() {
		return true;
	}
	
	public static void main(String[] args) {
		WithoutArgumentWithReturn obj=new WithoutArgumentWithReturn();
		System.out.println(obj.show());
		System.out.println(obj.go());
		System.out.println(obj.m1());
		System.out.println(obj.m2());
		System.out.println(display());
		
	}

}
