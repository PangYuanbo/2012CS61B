//Yuanbo Pang -CIS 35A
// Write a program that calculates the pay of an employee. The pay for the employee is calculated as follows:
// If hours worked are less than or equal to 40, the pay is the hourly rate times the hours worked.
// If hours worked are more than 40, the pay is the hourly rate times 40 plus 1.5 times the hourly rate for each hour above 40 hours.
import java.util.Scanner;
public class CalculatePay {


     private int getInputs(String prompt){
         Scanner input = new Scanner(System.in);
            System.out.print(prompt);
            return input.nextInt();
    }
    private double calculatePay(int hours, double rate){
        return ((hours > 40) ? (hours - 40) * 1.5 * rate + 40 * rate : hours * rate);
    }
    private void printPay(double pay){
        System.out.println("Pay: " + pay);
    }
    public static void main(String[] args) {
        int x=016;
        System.out.println(x);
        CalculatePay cp = new CalculatePay();
        int hours = cp.getInputs("Enter Hours: ");
        double rate = cp.getInputs("Enter Rate: ");
        double pay = cp.calculatePay(hours, rate);
        cp.printPay(pay);
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