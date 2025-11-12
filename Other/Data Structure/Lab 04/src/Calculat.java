//java recursive method
public class Calculat {
    static int factorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return (x * factorial(x-1)); //method calling- invocation
        }
    }

    public static void main(String[] args) {
        int num = 5;

        int fac = factorial(num);
        System.out.println("Factorials of "+num+":"+fac); // + mean concutanation
    }
}