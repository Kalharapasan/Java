import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner myObj =new Scanner(System.in);
		int num1,num2,num3,num4,num5,total;
		
		System.out.print("Enter number 1:");
			num1 =myObj.nextInt();
		System.out.print("Enter number 2:");
			num2 =myObj.nextInt();
		System.out.print("Enter number 3:");
			num3 =myObj.nextInt();
		System.out.print("Enter number 4:");
			num4 =myObj.nextInt();
		System.out.print("Enter number 5:");
			num5 =myObj.nextInt();
		
		
 		total=num1+num2+num3+num4+num5;	

		System.out.println("Total is:"+total);
		
		
}

}