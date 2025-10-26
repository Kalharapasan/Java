package BasicTexts;

import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        int x=1;
        do{
            try{
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Frist number:-");
        int num1 =input.nextInt();
        System.out.print("Enter Second number:-");
        int num2 =input.nextInt();
        int sum = num1/num2;
        System.out.println("Anser is:-"+sum);
        x=2;
        }catch(Exception e){
            System.out.println("You can do that");
            
            }
        }while(x==1);
    }
}
