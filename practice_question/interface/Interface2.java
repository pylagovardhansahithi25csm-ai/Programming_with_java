package abstraction;
interface One {
	int x=20;
	void add();
}
interface I2{
	int y=50;
	void divide();
}
class Double implements One,I2{

	@Override
	public void divide() {
		System.out.println("divide :" +( y/5));
		
	}

	@Override
	public void add() {
		System.out.println("add:" +(x+15));
		
	}
	
}
public class Interface2 {
	public static void main(String[] args) {
		Double d=new Double();
		d.divide();
		d.add();
		
	}
	

}
