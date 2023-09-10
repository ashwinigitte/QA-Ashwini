package homework;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		int n=50
				;
		if(n==0) {
			System.out.println("0 is neither prime nor composite");
		}
		
		for(int i=2;i<=n/2;i++) { //if a number is divisible by 1 and by itself then it is prime
			
			 if(n%i==1) {
				System.out.println(n+" is a prime number");
				break;
			}else {
				System.out.println(n+" is not a prime number");
				break;
			}
		}
	}

}
