package inheretence;
class A{
	int x=10;
	void multiply() {
		System.out.println("multiply:" + (x*2));
	}
}
class B extends A{
	int y=25;
	void division() {
		System.out.println("division:" + (x*y/5));
		
	}
}
class C extends B{
	void addition() {
		System.out.println("add:" + (x+y+10));
	}
}
public class MultiInheretence {
	public static void main(String[] args) {
		B obj =new B();
		C div =new C();
		obj.division();
		obj.multiply();
		div.addition();
		
		
	}

}
