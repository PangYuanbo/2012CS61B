
//Name: Yuanbo Pang
//Description: This program calculates the gross pay for an employee.It takes into account overtime pay, which is calculated as 1.5 times the hourly rate for hours worked above 40.

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hours, rate;

        System.out.print("Enter Hours: ");
        hours = input.nextDouble();

        System.out.print("Enter Rate: ");
        rate = input.nextDouble();

        double pay = ((hours > 40) ? (hours - 40) * 1.5 * rate + 40 * rate : hours * rate);
        System.out.println("Pay: " + pay);

        input.close();
    }
}

/*
Example Outputs:

1. 
Enter Hours: 45
Enter Rate: 10
Pay: 475.0

Calculation:
40 * 10 + 5 * 10 * 1.5 = 475.0

2.
Enter Hours: 38
Enter Rate: 15
Pay: 570.0

Calculation:
38 * 15 = 570.0
*/