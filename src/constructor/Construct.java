package constructor;

public class Construct {
		public Construct(int maths,int chem,int phy,String name) {
			System.out.println("Name:"+name+"\nMaths:"+maths+"\nChem:"+chem+"\nphy:"+phy+"\n");
			
		}
		
		
		public static void main(String[] args) {
			new Construct(99,100,99,"James");
			
			new Construct(100,100,99,"Gosling");
			
			new Construct(99,99,99,"Oracle");
			
			
		}

	}



