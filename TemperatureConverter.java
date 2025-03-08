import java.util.Scanner;

public class TemperatureConverter {
    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to get user input and perform conversions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Convert to (C)elsius or (F)ahrenheit? ");
        char choice = scanner.next().toUpperCase().charAt(0);
        
        if (choice == 'C') {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
        } else if (choice == 'F') {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
        } else {
            System.out.println("Invalid choice. Please enter C or F.");
        }
        
        scanner.close();
    }
}
