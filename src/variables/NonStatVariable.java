

//to call non-static variable inside non-static method

package variables;

public class NonStatVariable {
 int n=45;
	
public void method(){
	 System.out.println(n);
}
	 public static void main(String[] args) {
		 NonStatVariable obj=new  NonStatVariable();
		 obj.method();
	    	 
	 }
	
}

