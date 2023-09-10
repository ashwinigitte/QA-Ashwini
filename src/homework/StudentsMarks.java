package homework;

public class StudentsMarks {
	
	int maths;
	int physics;
	int chemistry;
	
	public static void show() {
		System.out.println("coding is interesting");//this is coded to use in package differentclasses class ClassB
	}
	
	public void avdhut() {
	 maths=94;
	 physics=98;
	 chemistry=92;
	 System.out.println("marks of Avdhut: "+"maths:"+maths+" physics:"+physics+" chemistry:"+chemistry+" total marks="+(maths+chemistry+physics));
	 int total=(maths+physics+chemistry);
		if(total>=265) {
			System.out.println("passed!!!");
		}else {
			System.out.println("failed");
		}
	}
	
	public void ram() {
	 maths=90;
	 physics=89;
	 chemistry=82;
	 System.out.println("marks of Ram: "+"maths:"+maths+" physics:"+physics+" chemistry:"+chemistry+" total marks="+(maths+chemistry+physics));
	 int total=(maths+physics+chemistry);
		if(total>=265) {
			System.out.println("passed!!!");
		}else {
			System.out.println("failed");
		}
	}
	
	public void shyam() {
	 maths=84;
	 physics=78;
	 chemistry=67;
	 System.out.println("marks of Shyam: "+"maths:"+maths+" physics:"+physics+" chemistry:"+chemistry+" total marks="+(maths+chemistry+physics));
	 int total=(maths+physics+chemistry);
		if(total>=265) {
			System.out.println("passed!!!");
		}else {
			System.out.println("failed");
		}
	}
	
	public static void main(String[] args) {
		StudentsMarks obj=new StudentsMarks();
		obj.avdhut();
		obj.ram();
		obj.shyam();
	}
}
