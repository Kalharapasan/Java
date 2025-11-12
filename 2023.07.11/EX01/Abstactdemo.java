abstract class Emmloyee {
    abstract void display();
}

class Servent extends Emmloyee {
    void display() {
        System.out.println("This is Abstact Method");
    }
}

public class Abstactdemo {
    public static void main(String[] args) {
        Servent obj = new Servent();
        obj.display();
    }
}

