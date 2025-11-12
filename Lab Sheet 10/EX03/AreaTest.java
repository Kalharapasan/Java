abstract class ObjectArea{
 abstract void area (int width ,int hight);
}

class  Square extends ObjectArea{
 void area(int width ,int hight){
   double Area = 0.5*width*hight;
   System.out.println("Square  is "+Area);
 }
}

class  Triangle extends ObjectArea{
 void area(int width ,int hight){
   int Area = width*hight;
   System.out.println("Triangle  is "+Area);
 }
}

class AreaTest{
 public static void main(String[] args) {
  Square sqr= new Square();
  sqr.area(50,80);
  Triangle tri = new Triangle();
  tri.area(30,80);
 }
}