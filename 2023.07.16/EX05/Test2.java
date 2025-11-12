interface Drawable{
     void draw();
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

public class Test2{
    public static void main(String[]args){
       Drawable obj1 =new Rectangle();
        obj1.draw();

        Drawable obj2 =new Circle();
        obj2.draw();
    }
}