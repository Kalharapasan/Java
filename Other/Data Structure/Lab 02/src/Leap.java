import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter Your Year:");
        int y = year.nextInt();
        if(y%4==0) {
            if(y%100==0) {
                if(y%400==0) {
                    System.out.println(y +"year is Leap Year..");
                } else {
                    System.out.println(y +"year is not Leap Year..");
                }
            } else {
                System.out.println(y +"year is not Leap Year..");
            }
        } else {
            System.out.println(y +"year is not Leap Year..");
        }
    }
}
