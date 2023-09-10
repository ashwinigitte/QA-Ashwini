package loops;

public class WhileLoop {
	
	int a=0;//can define here or can define as local variable

	public static void main(String[] args) {
		WhileLoop obj=new WhileLoop();
		
		//while loop first checks the condition and then only starts to execute
		while(obj.a<=5) {   //needs to create obj bcoz of non static var
			System.out.println("executing while loop");
			obj.a++;  //if not taken loop will run infinite times
		}
		
	}
}
