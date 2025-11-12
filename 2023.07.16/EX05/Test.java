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

public class Test{
    public static void main(String[]args){
        Rectangle obj1 =new Rectangle();
        obj1.draw();

        Circle obj2 =new Circle();
        obj2.draw();
    }
}