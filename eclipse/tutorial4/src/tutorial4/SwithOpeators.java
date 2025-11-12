package tutorial4;

import java.util.Scanner;

public class SwithOpeators {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		int num;
		System.out.print("Enter number:-");
		num=sc.nextInt();
		
		switch (num) {
		
		case 75:
			System.out.print("A pass");
			break;
		
		case 65:
			System.out.print("B pass");
			break;
		
		case 55:
			System.out.print("C pass");
			break;
		
		case 35:
			System.out.print("S pass");
			break;
		
		default:
			System.out.print("F pass");
			
		}


	}

}
