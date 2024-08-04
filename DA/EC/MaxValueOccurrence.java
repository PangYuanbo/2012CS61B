//Yuanbo Pang CIS 35A
// Description: This program reads integers from the user, finds the largest number, and counts its occurrences. The input ends with the number 0.

import java.util.Scanner;

public class MaxValueOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");

        int max = Integer.MIN_VALUE;
        int count = 0;
        int number;


        while ((number = input.nextInt()) != 0) {
            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }


        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

        input.close();
    }
}
//Enter numbers: 3 5 2 5 5 5 0
//The largest number is 5
//The occurrence count of the largest number is 4
//
//Enter numbers: 3 6 5 4 2 4 5 4 5 5 0
//The largest number is 6
//The occurrence count of the largest number is 1
