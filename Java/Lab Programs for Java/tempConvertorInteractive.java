import java.util.*;

public class tempConvertorInteractive {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Celcius to Fahrenheit
        System.out.println("Enter temperature in Celcius: ");
        double inputCelcius = sc.nextDouble();
        double convertedToFahrenheit = celsiusToFahrenheit(inputCelcius);
        System.out.println(inputCelcius + "°C = " + convertedToFahrenheit + "°F");

        // Fahrenheit to Celcius
        System.out.println("Enter temperature in Fahrenheit: ");
        double inputFahrenheit = sc.nextDouble();
        double convertedToCelsius = fahrenheitToCelcius(inputFahrenheit);
        System.out.println(inputFahrenheit + "°F = " + convertedToCelsius + "°C");

        sc.close();

        System.out.println("Maryam Siddique");
        System.out.println("BSCS-KC-012");
    }
}
