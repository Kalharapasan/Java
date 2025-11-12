interface SmatPhone{
    abstract void call();
    abstract void GetCall();
}

class Apple implements  SmatPhone{
     public void call(){
        System.out.println("This is an interface");
    }

    public void GetCall(){
        System.out.println("This is an interface method 2");

    }
}
public class Mobile{
    public static void main(String []args){
        Apple mobaile =new Apple();
        mobaile .call();
        mobaile.GetCall();
    }
}
