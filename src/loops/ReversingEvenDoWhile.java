package loops;

public class ReversingEvenDoWhile {
	
	int x=100;
	
	public static void main(String[] args) {
		ReversingEvenDoWhile obj=new ReversingEvenDoWhile();
		
		do {
			if(obj.x%2!=1) {//(obj.x==0){
				System.out.print(obj.x+" ");
			}
			--obj.x;
		}while(obj.x>=0);
	}

}
