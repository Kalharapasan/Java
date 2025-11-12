package tutorial4;

import java.util.Scanner;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int num;
		int num2;
		System.out.print("Enter number:-");
		num=sc.nextInt();
		System.out.print("Enter number:-");
		num2=sc.nextInt();
		if(num ==65 && num2 ==45) {
			System.out.print("AND Operators");
		}
		else if (num ==65 || num2 ==45) {
			System.out.println("Or Operators");
			
		}
		else {
			System.err.print("Error");
		}

	}

}
