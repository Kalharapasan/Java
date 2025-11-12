import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
      Scanner check = new Scanner(System.in);
          System.out.println("Enter Your Number");
          int num = check.nextInt();
          while( num > 0) {
              if(num%2==0) {
                  System.out.println("The " +num + "is Even Number..");
              } else {
                  System.out.println("The " +num + "is Odd Number..");
              }
              System.out.println("Enter Your Number..");
              num = check.nextInt();
          }
    }
}
