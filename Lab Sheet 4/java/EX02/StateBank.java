import java.util.Scanner;

class StateBank{
    int bankid;
    String bankname;
    float banksalary;

    void insertBankDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bank ID:-");
        bankid =scanner.nextInt();
        System.out.print("Enter Bank Name:-");
        bankname =scanner.nextLine();
        System.out.print("Enter Bank salary:-");
        banksalary =scanner.nextFloat();
    }

    void displayBankDetails (){

        System.out.println("Bank ID :-"+bankid);
        System.out.println("Bank Name :-"+bankname);
        System.out.println("Bank Salary:-"+banksalary);

    }
}

class PrivateBank{
    
    public static void main(String[]args){

        StateBank pb1 =new StateBank();
        pb1.insertBankDetails();
        pb1.displayBankDetails();

        StateBank pb2 =new StateBank();
        pb2.insertBankDetails();
        pb2.displayBankDetails();

        StateBank pb3 =new StateBank();
        pb3.insertBankDetails();
        pb3.displayBankDetails();




    }
}