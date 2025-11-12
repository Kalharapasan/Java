package tutorial4;

import java.util.Scanner;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x;
		System.out.print("Enter number:-");
		x=scanner.nextInt();
		
		x+=10;//x=x+1
		
		System.out.println("Increment number is:-"+x);
		x-=10;//x=x-1
		System.out.println("Decrement number is:-"+x);

	}

}
