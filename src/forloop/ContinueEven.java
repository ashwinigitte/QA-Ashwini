
//•	Write program to find 1 to 100 even numbers using continue keyword
package forloop;

public class ContinueEven {
	
	public static void main(String[] args) {
		System.out.println("1 to 100 even numbers are:");
		for(int i=1;i<=100;i++) {
			if(i%2==1)
				continue;
			System.out.print(i+" ");
				
		}
	}

}
