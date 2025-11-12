public class Default {

    int a;
    boolean b;

    public void Display() {

    System.out.println("X is "+a);
    System.out.print("Y is "+b);
    }

    public static void main(String[] args) {

        Default D1 =new Default();

        D1.a=1;
        D1.b=true;
        D1.Display();


    }
}