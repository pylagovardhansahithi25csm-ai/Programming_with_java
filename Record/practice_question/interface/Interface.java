package javacore;

interface I1{
	int x=5;
	int y=3;
	void sample();
		void subtract();
			
	}
class Project implements I1{
	@Override
	public void sample() {
 System.out.println("multiply:" +(x*5));
	
	}

	@Override
	public void subtract() {
		System.out.println("subtract :" +(x-y));
	}
	
}
public class Interface {
	public static void main(String[] args) {
		Project p =new Project();
		p.sample();
		p.subtract();
	}
	
}
