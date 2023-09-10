package forloop;

public class Continue {
	
	
	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			if(i<2)
				continue;
			
			if(i==6)
				continue;
			
			if(i>35)
				continue;
			System.out.print(i+" ");
		}
	}


}
