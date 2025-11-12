abstract  class Car{
 abstract void run();
} 

class Axio extends Car  {
   void run(){
    System.out.println("Made in Japan");
   }
}
class Main{
   public static void main(String[] args) {
      Axio obj =new Axio();
      obj.run();
      

   }
}