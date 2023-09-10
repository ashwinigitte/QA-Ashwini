//if we do not assign any value to the static variable then jvm will assign '0' by default

package variables;

public class StaticVariableCalling {
	
		//static int a=50;//value assigned 
		//static int b=45;
	
	   static int a;
	   static int b;//value not assigned to static variable
	   int d;//value not assigned to non static var
		
		
		public static void main(String[] args) {
			int c=a+b;
			System.out.println(c);
			
			StaticVariableCalling obj=new StaticVariableCalling();
				System.out.println(obj.d);
			
		}
	}



