/*
  Yuanbo Pang CIS 35A
  Description: This program finds the location of the largest element in a user-defined two-dimensional array.
  The locateLargest method returns the indices of the largest element in the array.
  The main method prompts the user to enter the dimensions and elements of the array, and then displays the location of the largest element.
 */

import java.util.Scanner;

public class LocateLargestElement {

    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2];
        double max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        int[] location = locateLargest(array);

        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
    }
}

/*
Your result

Example 1:
Enter the number of rows and columns of the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The location of the largest element is at (1, 2)

Example 2:
Enter the number of rows and columns of the array: 2 3
Enter the array:
11.5 22.3 33.1
44.8 55.5 66.2
The location of the largest element is at (1, 2)
*/
