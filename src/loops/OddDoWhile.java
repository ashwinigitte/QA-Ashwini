package loops;

public class OddDoWhile {
	int x=0;//non-static var
	
	public static void main(String[] args) {
		OddDoWhile obj=new OddDoWhile();
		
		do {
			//if(obj.x==1) {//can also used
			if(!(obj.x%2==0) ){
				System.out.print(obj.x + "\t");
			}
			obj.x++;
		}while(obj.x<=100);
	}

}
