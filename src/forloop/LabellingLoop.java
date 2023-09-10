package forloop;

public class LabellingLoop {

	
	public static void main(String[] args) {
		
		OuterForLoop:for(int i=0;i<=5;i++) {
			System.out.print("OuterForLoop" +"\t");
			
			for(int j=0;j<=5;j++) {
				
				if(j==2) 
					break OuterForLoop;//when value of j becomes 2,OuterLoop stops execution and automatically InnerForLoop stops execution
					System.out.print("InnerForLoop" +"\t");
				
			
				
			}
			
		}
	}
}
