package abstraction;
interface Two{
	int radius=20;
void area();
}
interface Three{
	int length=25 ,breadth=5;
	void rectangle();
}
interface Four{
	int x=50;
	void add();
}
interface I3 extends Two,Three,Four{
	void area();
}
public class Interface3 implements I3{
	

	@Override
	public void rectangle() {
		System.out.println("area of rectangle : " +(length*breadth));
	}

	@Override
	public void add() {
	System.out.println("add:" +(x+50));
		
	}

	@Override
	public void area() {
		System.out.println("area of circle: " +(3.14 *radius*radius));
	}
	public static void main(String[] args) {
		
Interface3 i=new Interface3();
i.rectangle();
i.add();
i.area();
}
}

