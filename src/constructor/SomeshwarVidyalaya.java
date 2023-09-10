package constructor;

public class SomeshwarVidyalaya {
	int maths;
	int chem;
	int phy;
	String name;
	public SomeshwarVidyalaya(int maths,int chem,int phy,String name) {
		this.maths=maths;
		this.phy=phy;
		this.chem=chem;
		this.name=name;
		
	}
	
	public void james() {
    System.out.println("Name:"+name+"\nMaths:"+maths+"\nChem:"+chem+"\nphy:"+phy+"\n");
 
	}
	
	public void gosling(int a,int b) {
	System.out.println("Name:"+name+"\nMaths:"+maths+"\nChem:"+chem+"\nphy:"+phy+"\n");
	
	}
		
	public void oracle(float a,boolean b) {
    System.out.println("Name:"+name+"\nMaths:"+maths+"\nChem:"+chem+"\nphy:"+phy);
	}
	
	public static void main(String[] args) {
		SomeshwarVidyalaya obj=new SomeshwarVidyalaya(99,100,99,"James");
		obj.james();
		SomeshwarVidyalaya ob=new SomeshwarVidyalaya(100,100,99,"Gosling");
		ob.gosling(3,4);
		SomeshwarVidyalaya obj1=new SomeshwarVidyalaya(99,99,99,"Oracle");
		obj1.oracle(3.8f,true);
		
		
		
		
	}

}
