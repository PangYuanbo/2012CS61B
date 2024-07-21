//Yuanbo Pang -CIS 35A
// Write a program that calculates the pay of an employee. The pay for the employee is calculated as follows:
// If hours worked are less than or equal to 40, the pay is the hourly rate times the hours worked.
// If hours worked are more than 40, the pay is the hourly rate times 40 plus 1.5 times the hourly rate for each hour above 40 hours.
import java.util.Scanner;
public class ComputingPay{
    private int hours;
    private double rate;
    private double pay;

    private void calculatePay(){
        pay = ((hours > 40) ? (hours - 40) * 1.5 * rate + 40 * rate : hours * rate);
    }

    private void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Hours: ");
        hours = input.nextInt();
        System.out.print("Enter Rate: ");
        rate = input.nextDouble();
    }

    private void printPay(){
        System.out.println("Pay: " + pay);
    }

    public static void main(String[] args){
        ComputingPay computePay = new ComputingPay();
        computePay.getInput();
        computePay.calculatePay();
        computePay.printPay();
    }
}
/*
Example Outputs:

Example 1:
Enter Hours: 45
Enter Rate: 10
Pay: 475.0

Example 2:
Enter Hours: 35
Enter Rate: 12.5
Pay: 437.5
*/