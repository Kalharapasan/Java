abstract class Animal {
    abstract void animalSound();

    void sleep() {
        System.out.println("Cow is Sleep");
    }

}

class Cow extends Animal {
    void animalSound() {
        System.out.println("Cow  Sound is umba");

    }
}

public class Main {

    public static void main(String[] args) {
        Cow obj = new Cow();
        obj.animalSound();
        obj.sleep();
    }

}
