import java.util.Scanner;

public class TemparaturUmrechnung {
    public static void main(String[] args) {
        System.out.println("Welcome to the Celsius - Fahrenheit calculator!");

        // ask for and scan temperature for calculation
        System.out.print("Enter a value for calculation: ");
        Scanner getTemperature = new Scanner(System.in);
        double temperature = getTemperature.nextDouble();

        // calculate temperature and print it
        System.out.println(temperature + "° Fahrenheit = " + ((temperature -32) * 5 / 9) + "° Celsius!");
        System.out.println(temperature + "° Celsius = " + (temperature * 1.8 + 32) + "° Fahrenheit!");
    }
}
