package differentclasses;


import homework.StudentsMarks;
import localvariables.VariablesSummary;

public class ClassB {

	public static void main(String[] args) {
		
		System.out.println(ClassA.a);//calling the static variable of same package but of different class
		ClassA.method();//calling the static method of same package but of different class
		
		ClassA object=new ClassA();
		System.out.println(object.b);//calling the non-static variable of same package but of different class
		object.method1();//calling the non-static method of same package but of different class
		
		StudentsMarks obj1=new StudentsMarks();
		obj1.avdhut();//calling the method of class of different package
		StudentsMarks.show();//calling static method of different package
		
		
		//System.out.println(VariablesSummary.h);/////////this comes in access modifiers we will see then(needs to make variable as public
		
	}
}
