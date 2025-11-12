import java.util.Scanner;

public class Ex8{
	public static void main(String []args){
		int num1,num2,num3,num4,num5,sum;
		float avg;
		Scanner NUM1 = new Scanner(System.in);
		System.out.print("Enter you Number 1:");
		num1 =NUM1.nextInt();
		System.out.print("Enter you Number 2:");
		num2 =NUM1.nextInt();
		System.out.print("Enter you Number 3:");
		num3 =NUM1.nextInt();
		System.out.print("Enter you Number 4:");
		num4 =NUM1.nextInt();
		System.out.print("Enter you Number 5:");
		num5 =NUM1.nextInt();

		sum =num1+num2+num3+num4+num4;
		avg =sum/5;
		System.out.println("Sumery is:"+sum);
		System.out.println("Average. is:"+avg);
	}
}