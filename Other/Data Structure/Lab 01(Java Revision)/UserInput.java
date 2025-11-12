import java.util.Scanner;
class UserInput {
	public static void main(String args[]) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter Your First Name:");
		String fname = name.next();   //String fname = name.nextLine();  //we can use 2method next/nextLine
		System.out.println("Enter Your Last Name:");
		String lname = name.next();   //String lname = name.nextLine();
		
		System.out.println("My Name is:" +fname+" " +lname);
		
		//Sir Doc
		String s = "The mark anatony is here";
		
		String str[] = s.split(" "); // creting string array namestr // s is object // split is a method 
		for(String m:str) {
			System.out.println(m);
		}
	}
}
