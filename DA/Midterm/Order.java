// Yuanbo Pang CIS 35A
//This Java program provides a menu-driven ordering and checkout system for the De Anza College Food Court. The program consists of two main classes: Driver and Order.The Driver class is the entry point for the program and is responsible for calling the methods of the Order class to display the menu, get user inputs, calculate the bill, and print the final bill.The Order class contains a number of methods: displayMenu() displays the menu, getInputs() obtains and validates user inputs, calculateBasePrice() calculates the total price, calculate() calculates the total price, calculate() calculates the total price, and calculate() calculates the total price. calculateBasePrice() calculates the total price, calculate() asks whether the user is a student or an employee and calculates the tax, and printBill() prints the detailed bill. The program ensures the validity of user input and provides a clear and user-friendly way to manage the ordering and checkout process.

import java.util.Scanner;
// Order.java
public class Order {
    private int[] quantities = new int[5];
    private final double[] prices = {5.25, 5.75, 5.95, 5.95, 5.95};
    private final String[] items = {"De Anza Burger", "Bacon Cheese", "Mushroom Swiss", "Western Burger", "Don Cali Burger"};
    private boolean isStudent;

    // Method to display the menu
    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - $" + String.format("%.2f", prices[i]));
        }
        System.out.println("6. Exit");
    }

    // Method to get user inputs
    public void getInputs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please select an option (1-6): ");
            String input = scanner.nextLine().trim();
            try {
                int choice = Integer.parseInt(input);
                if (choice == 6) {
                    System.out.println("Exiting...");
                    return;
                } else if (choice >= 1 && choice <= 5) {
                    System.out.print("Enter quantity for " + items[choice - 1] + ": ");
                    int quantity = Integer.parseInt(scanner.nextLine().trim());
                    if (quantity >= 0) {
                        quantities[choice - 1] += quantity;
                    } else {
                        System.out.println("Quantity cannot be negative.");
                    }
                } else {
                    System.out.println("Invalid option. Please select between 1 and 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    // Method to calculate the base price
    public double calculateBasePrice() {
        double subtotal = 0;
        for (int i = 0; i < quantities.length; i++) {
            subtotal += quantities[i] * prices[i];
        }
        return subtotal;
    }

    // Method to check if the user is a student or staff and then calculate the final bill
    public void calculate() {
        double subtotal = calculateBasePrice();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you a student or staff (enter 'student' or 'staff'): ");
        String userType = scanner.nextLine().trim().toLowerCase();
        isStudent = userType.equals("student");
        double tax = isStudent ? 0 : subtotal * 0.09;
        double total = subtotal + tax;
    }

    // Method to print the bill
    public void printBill() {
        System.out.println("Bill:");
        for (int i = 0; i < items.length; i++) {
            if (quantities[i] > 0) {
                System.out.println(items[i] + " x " + quantities[i] + " = $" + String.format("%.2f", quantities[i] * prices[i]));
            }
        }
        double subtotal = calculateBasePrice();
        double tax = isStudent ? 0 : subtotal * 0.09;
        double total = subtotal + tax;
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}



/*
Output example 1:
Menu:
1. De Anza Burger - $5.25
2. Bacon Cheese - $5.75
3. Mushroom Swiss - $5.95
4. Western Burger - $5.95
5. Don Cali Burger - $5.95
6. Exit
Please select an option (1-6): 1
Enter quantity for De Anza Burger: 2
Please select an option (1-6): 3
Enter quantity for Mushroom Swiss: 1
Please select an option (1-6): 6
Exiting...
Are you a student or staff (enter 'student' or 'staff'): student
Bill:
De Anza Burger x 2 = $10.50
Mushroom Swiss x 1 = $5.95
Subtotal: $16.45
Tax: $0.00
Total: $16.45

Output example 2:
Menu:
1. De Anza Burger - $5.25
2. Bacon Cheese - $5.75
3. Mushroom Swiss - $5.95
4. Western Burger - $5.95
5. Don Cali Burger - $5.95
6. Exit
Please select an option (1-6): 2
Enter quantity for Bacon Cheese: 3
Please select an option (1-6): 4
Enter quantity for Western Burger: 2
Please select an option (1-6): 6
Exiting...
Are you a student or staff (enter 'student' or 'staff'): staff
Bill:
Bacon Cheese x 3 = $17.25
Western Burger x 2 = $11.90
Subtotal: $29.15
Tax: $2.62
Total: $31.77
*/