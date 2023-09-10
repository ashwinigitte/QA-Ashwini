//if name of local variable is same as name of non static variable 
//then to access non static variable inside non static method "this" keyword is used

package localvariables;

public class SameName1 {
int d=54;//NON STATIC VAR

public void method() {	//NON STATIC METHOD
	int d=67;	//LOCAL VAR
	
	System.out.println(this.d);	//ACCESS NON STATIC VAR INSIDE NON STATIC METHOD
	System.out.println(d);
}

public static void main(String[] args) {
	SameName1 obj=new SameName1();
	obj.method();//CALLING NON STATIC METHOD
	
	//if name of local variable is same as name of non static variable 
	//then to access non static variable inside static method we need to 
	//create object and then need to give reference of that object to that variable

//	package localvariables;
//
//	public class SameName1 {
//	int d=54;//NON STATIC VAR
//
//	public static void method() {	//NON STATIC METHOD
//		int d=67;	//LOCAL VAR
//		SameName1 sn=new SameName1();
//		System.out.println(sn.d);	//ACCESS NON STATIC VAR INSIDE NON STATIC METHOD
//		System.out.println(d);
//	}
//
//	public static void main(String[] args) {
//		SameName1 obj=new SameName1();
//		obj.method();//CALLING NON STATIC METHOD
//		
//	}
//	}

	
	
}
}
