class A{
    void print_A(){
        System.out.println("Class A");
    }
}

class B extends A{
     void print_B(){
        System.out.println("Class B");
    }
}
class C extends B{
     void print_C(){
        System.out.println("Class C");
}
}
class D extends C{
     void print_D(){
        System.out.println("Class D");
    }
}
class Test2 extends D{
    
    public static void main(String[]args){

        Test2 Obj_B= new Test2();
        Test2 Obj_C= new Test2();
        Test2 Obj_D= new Test2();

        Obj_B.print_A();
        Obj_B.print_B();

        Obj_C.print_A();
        Obj_C.print_C();

        Obj_D.print_A();
        Obj_D.print_D();


    }

}