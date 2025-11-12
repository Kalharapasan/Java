package tutorial4;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int num;
		System.out.print("Enter number:-");
		num=sc.nextInt();
		
		 if (num >=75) {
			System.out.println("A Pass");
			
		}
		else if (num >=65) {
			System.out.println("B Pass");
			
		}
		else if (num >=55) {
			System.out.println("C Pass");
			
		}
		else if (num >=35) {
			System.out.println("S Pass");
			
		}
		else {
			System.out.println("F Pass");
		}

	}

}
