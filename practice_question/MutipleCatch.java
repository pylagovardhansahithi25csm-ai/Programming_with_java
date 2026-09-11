package project;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatch {
public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("enter a and b:");
		 int a=sc.nextInt();
		 
		 int b=sc.nextInt();
		 int c;
		 
	System.out.println("divide:" + (c=a/b) );
	}catch(ArithmeticException ae){
		System.out.println("this is not divide with zero:");
	}catch(InputMismatchException ie) {
		System.out.println("this is only contain with integer:");
	}
sc.close();
}
}
