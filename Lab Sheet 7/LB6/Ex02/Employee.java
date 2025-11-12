public class Employee {

    String Employee_Number;
    double Basic_Salary;
    double Allowance;
    double Salary;

    public Employee(String Number, double  Salary) {

        Employee_Number = Number;
        Basic_Salary = Salary;

    }

    public void Calculation() {

        if (Basic_Salary > 100000) {

            Allowance = (0.1 * Basic_Salary);

        } else {

            Allowance = 0;
        }
        Salary = Allowance + Basic_Salary;

    }

    public void Display() {

        System.out.println("Employee Number:- " + Employee_Number);
        System.out.println("Employee Basic Salary:- " + Basic_Salary);
        System.out.println("Employee Allownce:- " + Allowance);
        System.out.println("Employee Salary:- " + Salary);
    }

}