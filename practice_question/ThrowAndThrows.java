package project;

public class ThrowAndThrows {
	 static void Age(int age) throws Exception{
		 if(age<18) {
			 throw new Exception (" you must be at least 18 years old :");
			 
		 }
		 System.out.println(" welcome to system:");
	
	 }
 public static void main(String args[]) {
	try {
		Age(15);
	}catch(Exception e) {
		System.out.println("exception:" + e.getMessage());
	}

 }
 
}
