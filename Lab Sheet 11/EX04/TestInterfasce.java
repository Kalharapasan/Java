interface Drawable{
 abstract void draw();

 default void message(){
  System.out.println("Welcome to Interface in Java");
 }

}
class Rectangle implements Drawable{
  public void draw(){
   System.out.println("Drow a Rectangel");
  }
}

public class TestInterfasce {
 public static void main(String[] args) {
  Rectangle re =new Rectangle();
  re.message();
  re.draw();
 }
}
