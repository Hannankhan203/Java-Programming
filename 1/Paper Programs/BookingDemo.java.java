// Base class: Booking
class Booking {
    protected String customerName;
    protected String bookingDate;

    public Booking(String customerName, String bookingDate) {
        this.customerName = customerName;
        this.bookingDate = bookingDate;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Booking Date: " + bookingDate);
    }
}

// Derived class: CarBooking
class CarBooking extends Booking {
    private String carModel;
    private int rentalDays;

    public CarBooking(String customerName, String bookingDate, String carModel, int rentalDays) {
        super(customerName, bookingDate);
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
    }
}

// Derived class: BusBooking
class BusBooking extends Booking {
    private int numberOfPassengers;
    private String destination;

    public BusBooking(String customerName, String bookingDate, int numberOfPassengers, String destination) {
        super(customerName, bookingDate);
        this.numberOfPassengers = numberOfPassengers;
        this.destination = destination;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Passengers: " + numberOfPassengers);
        System.out.println("Destination: " + destination);
    }
}

// Main class
public class ReservationSystem {
    public static void main(String[] args) {
        // Create a car booking
        CarBooking carBooking = new CarBooking("John Doe", "2024-12-28", "Toyota Camry", 5);
        System.out.println("Car Booking Details:");
        carBooking.displayDetails();

        System.out.println("\n----------------------------\n");

        // Create a bus booking
        BusBooking busBooking = new BusBooking("Jane Smith", "2024-12-29", 40, "New York");
        System.out.println("Bus Booking Details:");
        busBooking.displayDetails();
    }
}
