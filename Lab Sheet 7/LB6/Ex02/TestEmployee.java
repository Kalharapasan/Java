import java.util.Scanner;

public class TestEmployee {

    public static void main(String []args){

        String Nunmber;
        double Salary;


        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter Employee Number:-");
        Nunmber =scanner.nextLine();
        System.out.print("Enter Employee salary:-");
        Salary=scanner.nextDouble();
        System.out.println("");

        Employee Em1 =new Employee(Nunmber,Salary);

        Em1.Calculation();
        Em1.Display();

        






    }
}