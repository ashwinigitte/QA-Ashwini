//IF NAME OF LOCAL VAR==NAME OF STATIC VAR THEN TO ACCESS STATIC VAR INSIDE ANY METHOD 
//ClassName.VariableName

package localvariables;

public class SameName2 {
	static int e=98;//STATIC VARIABLE
	
	public void method() {
		int e=44;//LOCAL VARIABLE
		System.out.println(SameName2.e);//ACCESSING THROUGH ClassName.VariableName
	    System.out.println(e);
	}
	
	public static void main(String[] args) {
	SameName2 obj=new SameName2();//OBJECT CREATION
	obj.method();//NON STATIC METHOD CALLING
		
	}

}
