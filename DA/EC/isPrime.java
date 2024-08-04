// Name: Yuanbo Pang CIS 35A
// Description: This program asks the user to enter a number and then displays the first 'userInput' prime numbers.
// It includes a method 'isPrime' to check the primality of a number.
import java.util.Scanner;

public class PrimeNumbers {


    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void displayPrimes(int userInput) {
        int count = 0;
        int num = 2;
        while (count < userInput) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.MAX_VALUE + 1;

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        
        System.out.println("The first " + userInput + " prime numbers are:");
        displayPrimes(userInput);

        scanner.close();
    }


}
 /*
    Sample Outputs:

    For userInput = 10:
    The first 10 prime numbers are:
    2 3 5 7 11 13 17 19 23 29

    For userInput = 15:
    The first 15 prime numbers are:
    2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
*/