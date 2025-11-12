interface Cricketer{
    abstract void bow1();
    
}
class Paly implements Cricketer{

    public void bow1(){
        System.out.println("He is Cricketer");
    }
}
public class Main{
    public static void main(String[]args){
        Paly obj =new Paly();
        obj.bow1();
    }
}
