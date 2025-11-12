import java.util.Scanner;

public class Employee{
	public static void main(String []args){
		String empid_name;
		float salary;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter empid name:");
		empid_name =scanner.nextLine();
		
		System.out.print("Enter salary:");
		salary=scanner.nextFloat();

		System.out.print("empid name is a:"+empid_name);
		System.out.print("salary is a:"+salary);
	}
}