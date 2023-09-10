package forloop;

public class ReversingOddFor {
	
	public static void main(String[] args) {
		
		for(int i=100;i>=0;i--) {
			
			if(i%2==1) {
				System.out.print(i + "\t");
			}
		}
	}

}
