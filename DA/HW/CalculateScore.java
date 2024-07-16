// Name: Yuanbo Pang -CiIS35A
// This program asks the user to enter a number of scores, alculates the average and the greatest score, assigns a final grade based on the average, and prints all entered scores.

import java.util.Scanner;

public class CalculateScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user how many scores they want to enter
        System.out.print("How many scores you want to enter: ");
        int n = input.nextInt();

        // Create an array based on the entered size
        double[] scores = new double[n];
        double max = 0, average = 0;

        // Ask the user to enter their scores in the quarter
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your score for entry " + (i+1) + ": ");
            scores[i] = input.nextDouble();
            average += scores[i];
            if (max < scores[i]) {
                max = scores[i];
            }
        }

        // Calculate and show the average
        average /= n;
        System.out.println("The average score is: " + average);

        // Show the final grade based on the average
        if (average >= 90.0) {
            System.out.println("Final Grade: A");
        } else if (average >= 80.0) {
            System.out.println("Final Grade: B");
        } else if (average >= 70.0) {
            System.out.println("Final Grade: C");
        } else if (average >= 60.0) {
            System.out.println("Final Grade: D");
        } else {
            System.out.println("Final Grade: F");
        }

        // Print the greatest score
        System.out.println("The greatest score is: " + max);

        // Print the scores (the elements of the array)
        System.out.println("The scores are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Score " + (i+1) + ": " + scores[i]);
        }


    }
}
/*
 At least two outputs (two different numbers and results)
 Result 1:
 How many scores you want to enter: 3
 Enter your score for entry 1: 85
 Enter your score for entry 2: 90
 Enter your score for entry 3: 78
 The average score is: 84.33333333333333
 Final Grade: B
 The greatest score is: 90.0
 The scores are:
 Score 1: 85.0
 Score 2: 90.0
 Score 3: 78.0

 Result 2:
 How many scores you want to enter: 4
 Enter your score for entry 1: 65
 Enter your score for entry 2: 70
 Enter your score for entry 3: 75
 Enter your score for entry 4: 60
 The average score is: 67.5
 Final Grade: D
 The greatest score is: 75.0
 The scores are:
 Score 1: 65.0
 Score 2: 70.0
 Score 3: 75.0
 Score 4: 60.0
 */
