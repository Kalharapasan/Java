abstract class Animal{
   abstract void animalSound();

   void sleep(){
    System.out.println("Cow Sleep Now");
   }

}

class Cow extends Animal{

 void animalSound(){
   System.out.println("Cow Sound");
 }

}

class Main{
  public static void main(String[] args) {
   Cow obj = new Cow();
   obj.animalSound();
   obj.sleep();
   
  
 }
}
