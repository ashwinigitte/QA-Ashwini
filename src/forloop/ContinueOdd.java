

//•	Write program to find 1 to 100 odd numbers using continue keyword
package forloop;

public class ContinueOdd {
	
	public static void main(String[] args) {
		System.out.println("1 to 100 odd numbers:");
		for(int i=1;i<=100;i++) {
			
			if(i%2==0)
				continue;
			System.out.print(i +" ");
		}
		
		
	}

}
