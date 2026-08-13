package javacore;

  abstract class A1 {
	int x=5;
	void sample() {
		System.out.println("additon :" +(x+20));
		
	}
	 abstract void demo();
		
	}
class A2 extends A1{
	void demo() {
		System.out.println("this is abstarct method:");
		
	}
	
}
class A3 extends A1{
	void multiply() {
		System.out.println("multiply:" +(x*2));
	}
	void demo() {
		int y=20;
		System.out.println("subtraction:" +(y+2));
	}
}

public class Abstract {
	public static void main(String[] args) {
	A2 obj1 = new A2();
    A3 obj2=new A3();
   obj1.demo() ;
   obj1.sample();
 obj2.demo();
 obj2.multiply();
}
}