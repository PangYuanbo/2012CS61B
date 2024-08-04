// Yuanbo Pang CIS 35A
// Description: This program prompts the user to enter a number and then displays the first n prime numbers.
// It includes an isPrime method to check if a number is prime.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of prime numbers to display: ");
        int userInput = input.nextInt();

        int count = 0;
        int number = 2;


        System.out.println("The first " + userInput + " prime numbers are:");
        while (count < userInput) {
            if (isPrime(number)) {
                count++;
                System.out.print(number + " ");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }

        input.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
Example Outputs:

1. User input: 10
   The first 10 prime numbers are:
   2 3 5 7 11 13 17 19 23 29

2. User input: 15
   The first 15 prime numbers are:
   2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
*/
