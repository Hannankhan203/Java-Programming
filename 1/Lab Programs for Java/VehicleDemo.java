abstract class Vehicle {
    protected String model;
    protected String color;
    protected String engine;
    protected int door;

    public Vehicle() {
        this.model = "Unknown";
        this.color = "Unknown";
        this.engine = "Unknown";
        this.door = 0;
    }

    public Vehicle(String model, String color, String engine, int door) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.door = door;
    }

    public void start() {
        System.out.println(model + " is starting.");
    }

    public void stop() {
        System.out.println(model + " is stopping.");
    }

    public void run() {
        System.out.println(model + " is running.");
    }

    public abstract void calculateSpeed();

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Engine: " + engine);
        System.out.println("Doors: " + door);
    }
}

class Car extends Vehicle {
    public Car(String model, String color, String engine, int door) {
        super(model, color, engine, door);
    }

    @Override
    public void calculateSpeed() {
        System.out.println(model + " can reach a speed of 200km/h");
    }
}

class Bike extends Vehicle {
    public Bike(String model, String color, String engine, int door) {
        super(model, color, engine, door);
    }

    @Override
    public void calculateSpeed() {
        System.out.println(model + " can reach a speed of 150km/h");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Sedan", "Red", "V6", 4);
        car.printInfo();
        car.start();
        car.run();
        car.calculateSpeed();
        car.stop();
        System.out.println();

        Bike bike = new Bike("Sportsbike", "Black", "500cc", 0);
        bike.printInfo();
        bike.start();
        bike.run();
        bike.calculateSpeed();
        bike.stop();

        System.out.println("Maryam Siddique");
        System.out.println("BSCS-KC-012");
    }
}
