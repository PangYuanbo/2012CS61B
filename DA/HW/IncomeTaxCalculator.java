// YuanboPang CIS 35A
//It's a program to help you calculator the Tax
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filing status : ");
        int status = scanner.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();

        double[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        double tax = 0;
        double[] bracket = brackets[status];

        if (income <= bracket[0]) {
            tax = income * rates[0];
        } else {
            tax = bracket[0] * rates[0];

            for (int i = 1; i < bracket.length; i++) {
                if (income > bracket[i]) {
                    tax += (bracket[i] - bracket[i - 1]) * rates[i];
                } else {
                    tax += (income - bracket[i - 1]) * rates[i];
                    break;
                }
            }

            if (income > bracket[bracket.length - 1]) {
                tax += (income - bracket[bracket.length - 1]) * rates[rates.length - 1];
            }
        }

        System.out.printf("Tax is %.2f\n", tax);
    }
}
/*
Example 1:
Enter the filing status: 0
Enter the taxable income: 100000
Tax is 21720.00

Example 2:
Enter the filing status: 1
Enter the taxable income: 300339
Tax is 76932.87
*/
