import java.util.Scanner;

public class Rectangle{


	int length; 
	int width;

	void insert(){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter You length:");
		length =scanner.nextInt();

		System.out.print("Enter You width:");
		width =scanner.nextInt();

	}

	static  int calculateArea(int length,int width){
		return length*width;
	}

}


class  TestRectangle{

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();

		rect1.insert();
		System.out.println("calculateArea is "+rect1.calculateArea(rect1.length,rect1.width));

		Rectangle rect2 = new Rectangle();

		rect2.insert();
		System.out.println("calculateArea is "+rect2.calculateArea(rect2.length,rect2.width));

	}
}