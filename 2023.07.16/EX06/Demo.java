interface Print{
    void print();
}
interface Show extends Print{
    void show();

}

class Test implements Show{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Hello world");
    }
}
public class Demo{
    
    public static void main(String[]args){
        Test obj =new Test();

        obj.print();
        obj.show();
    }
}