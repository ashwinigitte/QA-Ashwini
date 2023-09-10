package forloop;

public class ReversingEvenForLoop {
	
	public static void main(String[] args) {
		
		for(int i=50;i>=0;i--) {//no need to take curly braces bcoz if any declaration in for loop then only take curly braces
			
			if(i%2==0)          //no need to take curly braces bcoz here is single stmt only
			System.out.print(i +" ");
		}
	}

}