package loops;

public class ReversingEvenWhile {
	
	public static void main(String[] args) {
		int x=100;
		
		while(x>=0) {
			//if(x%2!=1) {
			if(x%2==0) {
				System.out.print(x+" ");
			}
			x--;
		}
	}

}
