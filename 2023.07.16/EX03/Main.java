interface Interface_1{
    abstract void Interface1_method1();
    abstract void Interface1_method2();
}

interface Interface_2{
     abstract void Interface2_method1();
     abstract void Interface2_method2();
}

class Subclass implements  Interface_1,Interface_2{
     public void Interface1_method1(){
        System.out.println("This is an interface1 method 1");
    }

    public void Interface1_method2(){
        System.out.println("This is an interface1 method 2");

    }
    public void Interface2_method1(){
        System.out.println("This is an interface 2 method 1");
    }

    public void Interface2_method2(){
        System.out.println("This is an interface 2 method 2");

    }
}


public class Main{
    public static void main(String []args){
        
        //Create the Object and call method Interface_1
        Subclass sub1= new Subclass();
        sub1.Interface1_method1();
        sub1.Interface1_method2();
        sub1.Interface2_method1();
        sub1.Interface2_method2();

       
    }
}
