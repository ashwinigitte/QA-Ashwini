package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		int x=1;
		int y=2;
		int z=0;
		
		do {
			System.out.println("this is a Do While Loop");
			x++;//if not taken then loop will execute infinite times
		}while(x<=4);
		
		
		//here we hv taken y=2 and trying to print while value of y is less than 2
		//in do while loop no matter whether the condition is right or wrong it will 
		//print output min 1 time...IMP
		do {
			System.out.println("don't skip to see this");
			y++;
		}while(y<2);
	
//for the value of y=2 it will not check condition,directly prints output but from 2nd i.e y++=3 
//at that time while condition is checked then depending upon that output is printed
       do {
    	   System.out.println("hello");
    	   z++;
       }while(z==15);//here condition fails bcoz z=0
       				//bcoz it can print while z=15...even then also 1 time output will be given
}
}