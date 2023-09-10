//non static variable values can be changed from object to object

package variables;

public class NonStaticVariable {
	int a;
	
	public static void main(String[] args) {
		NonStaticVariable obj=new NonStaticVariable();
		NonStaticVariable obj1=new NonStaticVariable();
		NonStaticVariable obj2=new NonStaticVariable();
		NonStaticVariable obj3=new NonStaticVariable();
		
		obj.a=34;//value assigned
		obj1.a=89;
		obj2.a=56;
		obj3.a=98;
		
		
		
		
		
		System.out.println(obj2.a);
		
		
	}

}
