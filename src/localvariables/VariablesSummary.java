package localvariables;

public class VariablesSummary {
	
//	static int a=55;//defined at class level
	int b=87;//defined at class level
	int d=44;
//	static int e;
//	int f;
	static boolean g;
	static int h=600;
	
	
	public void show() {
//		int c=43;//defined at method level
		int d=22;
		int h=200;
//		int g;//jvm does not assign default value to local variable
	
//		System.out.println(a);//accessed throughout the class
		System.out.println(b);//accessed throughout the object//####
//		System.out.println(c);//accessed within this method only
//		
//		System.out.println(e);
//		System.out.println(f);
		System.out.println(g);
		System.out.println(this.d);//@@@@
		System.out.println(d);
		System.out.println(VariablesSummary.h);
		System.out.println(h);
		
		
	}
		
		public static void main(String[] args) {
			
			VariablesSummary obj=new  VariablesSummary();
 			obj.show();
 			System.out.println(obj.b);//####
//			 obj.d=11;// Value of non staticvar can be changed from object to object
             System.out.println(obj.d);//@@@@
			
		}
	}


