public class Today6{
    int x;
    boolean y;

    void Today6(){
        System.out.println("X is " +x);
        System.out.println("Y is " +y);

    }

    public static void main (String []args){

        Today6 To =new Today6();

        To.x=10;
        To.y=true;

        To.Today6();

    }

}