package loops;

public class ReversingOddDoWhile {
	int x=100;
	
	public static void main(String[] args) {
		ReversingOddDoWhile obj=new ReversingOddDoWhile ();
		
		do {
			if(obj.x%2!=0) {
				System.out.print(obj.x+"\t");
				
			}
			obj.x--;
		}while(obj.x>=0);
	}

}
