//create a superclass

class Staff{
    
    double salary =100000;

} 

//create the subclass to inherit from the superclass

class Lecther extends Staff{
    int bonus =20000;

    
public static void main(String []args){

    Lecther increment =new Lecther();
    System.out.println("Lecther Basic salart is: "+increment.salary);
    System.out.println("Lecther bonus is: "+increment.bonus);
    System.out.println("Lecther bonus is: "+(increment.bonus+increment.salary));

}

}
