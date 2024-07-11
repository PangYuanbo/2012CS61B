import java.util.Scanner;

public class IncomeTaxCalculator {

    // Constants for the filing statuses
    public static final int SINGLE = 0;
    public static final int MARRIED_JOINTLY = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter filing status
        System.out.print("Enter the filing status (0 for Single, 1 for Married Filing Jointly, 2 for Married Filing Separately, 3 for Head of Household): ");
        int status = scanner.nextInt();

        // Prompt user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();

        // Compute the tax
        double tax = computeTax(status, income);

        // Display the result
        System.out.printf("Tax is %.2f\n", tax);
    }

    public static double computeTax(int status, double income) {
        // Tax brackets and rates for 2009
        double[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single
            {16700, 67900, 137050, 208850, 372950}, // Married Filing Jointly
            {8350, 33950, 68525, 104425, 186475}, // Married Filing Separately
            {11950, 45500, 117450, 190200, 372950} // Head of Household
        };

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        double tax = 0;
        double[] bracket = brackets[status];

        if (income <= bracket[0])
            return income * rates[0];
        else
            tax = bracket[0] * rates[0];

        for (int i = 1; i < bracket.length; i++) {
            if (income > bracket[i]) {
                tax += (bracket[i] - bracket[i - 1]) * rates[i];
            } else {
                tax += (income - bracket[i - 1]) * rates[i];
                return tax;
            }
        }

        tax += (income - bracket[bracket.length - 1]) * rates[rates.length - 1];

        return tax;
    }
}
