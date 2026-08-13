package javacore;

class Single {
	int x=10 ;
	
	void add(){
    System.out.println("addition :" + (x+100));	
	}
}
class Double extends Single{
	int y=20;
	void subtract() {
		System.out.println("subtract:" + (y-x));
	}
}
	

public class SingleInheritance {
	public static void main(String[] args) {
		Double d = new Double();
		
		d.subtract();
		d.add();
	}
		}
