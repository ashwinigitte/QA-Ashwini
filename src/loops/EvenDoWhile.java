package loops;

public class EvenDoWhile {
	int a=0;
	
	public static void main(String[] args) {
	EvenDoWhile obj=new EvenDoWhile();
		do {
			if(obj.a%2==0) {
				System.out.print(obj.a+" ");
			}
			obj.a++;
		}while(obj.a<=100);
	}

}
