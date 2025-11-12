import java.util.Scanner;
public class Rectangle{
	public static void main (String []args){
		
		Scanner sc =new Scanner(System.in);
		
		float length;
		float width;
		System.out.print("Enter Length:");
		length = sc.nextFloat();
		System.out.print("Enter Width:");
		width = sc.nextFloat();
		float Area;
		Area =length*width;
		System.out.println("Area is:"+Area);	
	}
}