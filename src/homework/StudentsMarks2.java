package homework;

public class StudentsMarks2 {
		int maths;
		int physics;
		int chemistry;
		
		public static void main(String[] args) {
			StudentsMarks2 obj=new StudentsMarks2();
			obj.maths=99;
			obj.physics=98;
			obj.chemistry=97;
			System.out.println("marks of Arya:"+"maths="+obj.maths+" physics="+ obj.physics+" chemistry="+obj.chemistry+" total:"+(obj.maths+obj.physics+obj.chemistry));
	       
			StudentsMarks2 obj1=new StudentsMarks2();
			obj1.maths=79;
			obj1.physics=78;
			obj1.chemistry=77;
			System.out.println("marks of Rohan:"+"maths="+obj1.maths+" physics="+ obj1.physics+" chemistry="+obj1.chemistry+" total:"+(obj1.maths+obj1.physics+obj1.chemistry));
			
			StudentsMarks2 obj2=new StudentsMarks2();
			obj2.maths=89;
			obj2.physics=88;
			obj2.chemistry=87;
			System.out.println("marks of Soham:"+"maths="+obj2.maths+" physics="+ obj2.physics+" chemistry="+obj2.chemistry+" total:"+(obj2.maths+obj2.physics+obj2.chemistry));
			
	}
	}

