abstract class ObjectArea {
    abstract void area(int width, int hight);
}

class Square extends ObjectArea {
    void area(int width, int hight) {
        int area = width * hight;
        System.out.println("Square Area is :" + area);
    }
}

class Triangle extends ObjectArea {
    void area(int width, int hight) {
        double area = (0.5) * width * hight;
        System.out.println("Triangle Area is :" + area);
    }
}

class AreaTest {
    public static void main(String[] args) {
        Square sqr = new Square();
        sqr.area(5, 10);
        Triangle tri = new Triangle();
        tri.area(6, 7);
    }
}