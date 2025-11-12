interface Vehicle {
    
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

class Bicycle implements Vehicle {
    private int gear;
    private int speed;

    public Bicycle() {
        gear = 1; 
        speed = 0; 
    }
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Bicycle: Changed gear to " + gear);
    }
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bicycle: Speeding up. Current speed: " + speed + " km/h");
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Bicycle: Applying brakes. Current speed: " + speed + " km/h");
    }
}

class Car implements Vehicle {
    private int gear;
    private int speed;

    public Car() {
        gear = 1; 
        speed = 0; 
    }
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Car: Changed gear to " + gear);
    }
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car: Speeding up. Current speed: " + speed + " km/h");
    }
    public void applyBrakes(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Car: Applying brakes. Current speed: " + speed + " km/h");
    }
}


public class VehicleTest {
    public static void main(String[] args) {
       
        Vehicle bicycle = new Bicycle();
        bicycle.changeGear(3);
        bicycle.speedUp(20);
        bicycle.applyBrakes(5);

        
        Vehicle car = new Car();
        car.changeGear(2);
        car.speedUp(60);
        car.applyBrakes(15);
    }
}
