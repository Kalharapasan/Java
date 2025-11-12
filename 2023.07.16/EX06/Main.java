interface Interface1{
        void method1();
}

interface Interface2 extends Interface1{
        void method1();

}

class Subclass implements Interface2{
    public void method1(){
         System.out.println(" method 1");

    }
    public void method2(){
         System.out.println(" method 2");

    }
    

}

public class Main{

    public static void main (String []args){
         Subclass obj =new  Subclass();
         obj.method1();
         obj.method2();

    
    }

}