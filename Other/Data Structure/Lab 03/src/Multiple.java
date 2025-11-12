import java.util.Scanner;
public class Multiple {
    public static void main(String[] args) {
        Scanner mul = new Scanner(System.in);
        System.out.println("Enter a Number");
        int x = mul.nextInt();

        System.out.println(x+"th Multiplication Table");
        for(int i=1;i<=12;i++) {
            System.out.println(i+"*"+x +" ="+i*x);
        }
    }
}
