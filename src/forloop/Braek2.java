package forloop;

public class Braek2 {
	
	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			
			if(i>4) //no need to take curly braces bcoz here is only stmt 
				break;//will not print for number greater than 4
			System.out.println(i);
			System.out.println("hello");
			System.out.println(" ");
		}
		
		System.out.print("jvm break ho gya!!!");//this stmt will execute bcoz it is not in for loop
	}

}
