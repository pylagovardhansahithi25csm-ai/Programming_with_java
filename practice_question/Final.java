package project;

public class Final{
	public static void main(String args[]) {
		int a=20,b=0;
		try {
			int c=(a/b);
			System.out.println("result:" +c);			
		}catch(ArithmeticException ae) {
			System.out.println("cannot divide with zero");
		}
		finally{
			System.out.println("finally block is executed");
		}
		
	}
}
