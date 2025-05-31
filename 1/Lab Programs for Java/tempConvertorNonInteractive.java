public class tempConvertorNonInteractive {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double celsius = 100;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        System.out.println("Maryam Siddique");
        System.out.println("BSCS-KC-012");
    }
}