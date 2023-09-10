package loops;

public class EvenWhile {
	
	public static void main(String[] args) {
		int x=0;
		
		while(x<=100) {
			
			if(x%2==0) {
				System.out.print(x +" ");//shows without else, if can run but without if,else can not run
				
			}
			x++;
		}
	}

}
