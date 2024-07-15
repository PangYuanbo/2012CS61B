// Name: Yuanbo Pang  CIS 35A
//This program requests a message from the user, how many times he wants the message to be printed and what type of loop.It then prints the message for however many times was specified with whatever loop was chosen. Again, a random document number is created and shown at the end.

import java.util.Scanner;

public class MessagePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your message: ");
        String message = scanner.nextLine();


        System.out.print("How many times do you want to print this message: ");
        int times = scanner.nextInt();


        System.out.println("There are three different types of loops:");
        System.out.println("1- while");
        System.out.println("2- do-while");
        System.out.println("3- for");
        System.out.print("What type of the loop do you want to use: ");
        int loopType = scanner.nextInt();

        switch (loopType) {
            case 1:
                System.out.println("Using \"while\" loop:");
                int i = 1;
                while (i <= times) {
                    System.out.println(i + "=> " + message);
                    i++;
                }
                break;

            case 2:
                System.out.println("Using \"do-while\" loop:");
                int j = 1;
                do {
                    System.out.println(j + "=> " + message);
                    j++;
                } while (j <= times);
                break;

            case 3:
                System.out.println("Using \"for\" loop:");
                for (int k = 1; k <= times; k++) {
                    System.out.println(k + "=> " + message);
                }
                break;

            default:
                System.out.println("Invalid loop type selected.");
                break;
        }

        int document_number = 1000 + (int) (Math.random() * 500);
        System.out.println("\nYour document number is: " + document_number);

        scanner.close();
    }
}

/*
Example outputs:

Enter your message: Welcome to Java
How many times do you want to print this message: 3
There are three different types of loops:
1- while
2- do-while
3- for
What type of the loop do you want to use: 3
Using "for" loop:
1=> Welcome to Java
2=> Welcome to Java
3=> Welcome to Java

Your document number is: 1128

Enter your message: Hello World
How many times do you want to print this message: 2
There are three different types of loops:
1- while
2- do-while
3- for
What type of the loop do you want to use: 1
Using "while" loop:
1=> Hello World
2=> Hello World

Your document number is: 1320
*/
