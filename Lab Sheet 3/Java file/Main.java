import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sca =new Scanner(System.in);
		Scanner sca2 =new Scanner(System.in);
		int reg_no;
		String Name;
		
		System.out.print("Enter you registration no:");
		reg_no = sca.nextInt();
		System.out.print("Enter you Name:");
		Name = sca2.nextLine();
		
		System.out.println();
		System.out.println("registration no:" +reg_no);
		System.out.println("Name:" +Name);
		
	}
}