package homework;

public class StudMarksArgsReturnTypes {
	
	
	public void showresult(int math,int chem,int phy,String name) {
//		System.out.println("name of the student:"+name);
//	    System.out.println("mathematics: "+math);
//	    System.out.println("physics: "+phy);
//	    System.out.println("chemistry: "+chem);
		int total=(math+phy+chem);//here we can make total as float or double,and can use in avg and percent
		float avg=total/3.0f;//can do double avg=total/3.0;
		float percent=total*100/300.0f;//when we hv to calculate in decimal,we need to declare any one value as float or double
	   System.out.println("name of the student:"+name+"\n"+"mathematics: "+math+"\n"+"chemistry: "+chem+"\n"+"physics: "+phy+"\n"+"total="+total+"\n"+"average marks:"+avg+"\n"+"percentage of marks obtained:"+percent+"%");
	  
	   if(total>=165) {
			System.out.println("passed!!!\n");
		}else {
			System.out.println("failed!!!\n");
		}
		
}
	
	public void marks() {
	showresult(98,99,90,"avdhut");
	showresult(88,89,80,"arohi");
	showresult(38,39,29,"anuj");
	}
	public static void main(String[] args) {
		StudMarksArgsReturnTypes obj=new StudMarksArgsReturnTypes();
  		obj.marks();                                //we can write showresult(98,99,90,"avdhut"); in main method also 
													//but then for every student we need to refer the object.
		
		
		
	}
}