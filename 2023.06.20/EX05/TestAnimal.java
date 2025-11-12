class Animal{
    void eat(){
        System.out.println("");

    }
}
class Dog extends Animal{
    void bark(){
         System.out.println("");

    }
}
class Puppy extends Dog{
    void weep(){
         System.out.println("");

    }
}

class TestAnimal{
    public static void main(String[]args){
        Puppy d =new Puppy();

        d.eat();
        d.bark();
        d.weep();
    }
}
