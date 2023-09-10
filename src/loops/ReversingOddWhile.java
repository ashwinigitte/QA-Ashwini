package loops;

public class ReversingOddWhile {
	
	public static void main(String[] args) {
		
		int x=100;
		while(x>=0) {
			if(x%2==1) {
				System.out.print(x);
				System.out.print(" ");
			}
			--x;//x--;//used bcoz hv to do reversing
		}
		
	}

}
