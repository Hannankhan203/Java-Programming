class Car {
    void drive(){
        System.out.println("The car is driving.");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car(){
            @Override
            void drive(){
                System.out.println("The car is driving very fast!");
            }
        };
        car.drive();
    }
}
