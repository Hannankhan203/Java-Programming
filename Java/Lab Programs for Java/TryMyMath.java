class MyMath {
    public static double roundToHundreth(double value){
        return Math.round(value * 100.0) / 100.0;
    }
}

public class TryMyMath {
    public static void printNumberDetails(double value){
        double roundedValue = MyMath.roundToHundreth(value);
        double square = MyMath.roundToHundreth(Math.pow(value, 2));
        double cube = MyMath.roundToHundreth(Math.pow(value, 3));

        System.out.println("Number: " + roundedValue);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
    }

    public static void main(String[] args) {
        double value = Math.E;
        System.out.println("Details for the value of Math.E");
        printNumberDetails(value);

        System.out.println("Maryam Siddique");
        System.out.println("BSCS-KC-012");
    }
}   