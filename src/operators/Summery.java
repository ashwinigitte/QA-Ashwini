package operators;

public class Summery {
	public static void main(String[] args) {
		int a=45;
		int c;
		int b;
		System.out.println(a);
		++a;					//pre-increment
		System.out.println(a);
		b=a++;					//post-increment
		System.out.println(b);	
		c=(--a)+(b--);			//pre-decrement & post-decrement & arithmetic addition
		System.out.println(c);
		int d=(--c)-(a++);      //arithmetic subtraction
		System.out.println(d);
		
		int e=c*d;             //multiplication
		System.out.println(e);
		int f=c/d;             //division
		System.out.println(f);
		int g=c%d;           //modulo operator
		System.out.println(g);
		
		if((g>2)&&(e<4000)) {//will print if both conditions shld be true
			System.out.println("it is a logical operator &&");
		}else if((a<b)||(f<g)) {//will print if any one condition is true
			System.out.println("it is a logical operator ||");
			
		}else if(!(c==92)&&(g==1)) 
			System.out.println("it is equals and not equals operators");
		else {
			System.out.println("none of the above conditions is true");
		}
	
		
		
}
}
