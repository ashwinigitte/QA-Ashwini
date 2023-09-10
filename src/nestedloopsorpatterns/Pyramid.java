package nestedloopsorpatterns;

public class Pyramid {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5-i;j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		for(int i=0;i<=5;i++) {//given by sir
//			for(int j=2*(5-i);j>=0;j--) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println("");
//		}
	}

}
