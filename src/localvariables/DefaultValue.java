//jvm does not provide default value to the local variable if not assigned

package localvariables;

public class DefaultValue {
	int a;
	
	public static void main(String[] args) {
		int b=5;	//if value not assigned then error- var b is not initialized
		System.out.println(b);
		
		DefaultValue obj=new DefaultValue ();
		System.out.println(obj.a);
		
  }	

}














//this is also correct way

//int a;	//non static variable
//
//public void m1() {	//non static method
//int b;	//local var
////System.out.println(b);//if value not assigned then error- var b is not initialized
//System.out.println(a);
//
//}
//public static void main(String[] args) {
//
//DefaultValue obj=new DefaultValue();
//	obj.m1();
//	
//	
//}
//
