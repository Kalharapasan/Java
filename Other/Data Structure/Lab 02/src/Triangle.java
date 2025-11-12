import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner tot = new Scanner(System.in);

        System.out.println("Enter Your first angle");
        int angle1 = tot.nextInt();
        System.out.println("Enter Your Second angle");
        int angle2 = tot.nextInt();
        System.out.println("Enter Your Third angle");
        int angle3 = tot.nextInt();

        int sum= angle1+angle2+angle3;

        if(sum == 180) {
            System.out.println("It is a triangle");
        } else {
            System.out.println("It is not a  triangle");
        }
    }
}
