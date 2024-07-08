// Name: Yuanbo Pang  - CIS 35A
// Description: This program let the user to enter a Fahrenheit degree and converts it to Celsius. Then print it out.

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a Fahrenheit degree
        System.out.print("Enter the Fahrenheit degree: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        // Display the result
        System.out.println("The Celsius degree of " + fahrenheit + " degree in Fahrenheit is: " + celsius);

        scanner.close();
    }
}

/*


Enter the Fahrenheit degree: 50
The Celsius degree of 50 degree in Fahrenheit is: 10.0

Enter the Fahrenheit degree: 100
The Celsius degree of 100 degree in Fahrenheit is: 37.77777777777778
*/
