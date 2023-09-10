package constructor;

public class Constructor {
	
		 
		public Constructor() {
			this(6.7f,4);//constructor at line no.11 is called by providing arg values
			System.out.println("I am a constructor");
			
		}
		public Constructor(float b,int a) {
			this(4);//constructor at line no.19 is called by providing value to arg int as 4
			System.out.println("i am a second constructor");
			
			}
		public void method() {
			System.out.println("this is a non static method");
		}
		public Constructor(int a) {
			method();//non-static metod is called here line no.16
			System.out.println("i am a third constructor");
		}
		
		public static void main(String[] args) {
		   new Constructor();
		
			
		}

	}



