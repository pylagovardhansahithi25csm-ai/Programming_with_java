package project;
import java.util.Scanner;

public class Array {
 
	static void display (int[]arr,int index) throws ArrayIndexOutOfBoundsException {
		
		System.out.println("element:" + arr[index]);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int []arr = {10,20,30,40,50};
		
		System.out.println("enter index:");
		int index=sc.nextInt();
		try {
			display(arr,index);
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Exception: invalid array index!");
			System.out.println("index are 0 to" +(arr.length-1));
		}
		System.out.println("program continues......");
		
  }
}
   
