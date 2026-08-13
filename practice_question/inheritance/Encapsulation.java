package javacore;

class Sample{
	int a;
	private float b;
	char c;
	private String s;

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
}
public class Encapsulation{
	public static void main(String[] args) {
		Sample s =new Sample();
		s.setA(50);
		System.out.println(s.getA());
		s.setB(2.5f);
		System.out.println(s.getB());
		s.setS("sahithi");
		System.out.println(s.getS());
	}
}

