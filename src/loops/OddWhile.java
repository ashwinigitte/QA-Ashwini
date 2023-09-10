package loops;

public class OddWhile {
	int  x=0;//non-static
	
	public static void main(String[] args) {
		OddWhile obj=new OddWhile();
		
		while(obj.x<=100) {
			if(obj.x%2==1)
				//if(obj.x%2!=0)//this can also be used
			                   //without curly braces also u can write here bcoz here in if only one stmt is there
				System.out.print(obj.x +" ");
			
			obj.x++;
		}
	}

}
