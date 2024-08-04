// Yuanbo Pang CIS 35A
//This Java program provides a menu-driven ordering and checkout system for the De Anza College Food Court. The program consists of two main classes: Driver and Order.The Driver class is the entry point for the program and is responsible for calling the methods of the Order class to display the menu, get user inputs, calculate the bill, and print the final bill.The Order class contains a number of methods: displayMenu() displays the menu, getInputs() obtains and validates user inputs, calculateBasePrice() calculates the total price, calculate() calculates the total price, calculate() calculates the total price, and calculate() calculates the total price. calculateBasePrice() calculates the total price, calculate() asks whether the user is a student or an employee and calculates the tax, and printBill() prints the detailed bill. The program ensures the validity of user input and provides a clear and user-friendly way to manage the ordering and checkout process.
public class Driver {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.displayMenu();
        order1.getInputs();
        order1.calculate();
        order1.printBill();
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