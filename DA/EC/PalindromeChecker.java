// Yuanbo Pang CIS 35A
// Description: This program prompts the user to enter a string and checks whether the string is a palindrome.
// It includes an isPalindrome method to determine if a string is a palindrome.

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String userInput = input.nextLine();


        if (isPalindrome(userInput)) {
            System.out.println("The string \"" + userInput + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + userInput + "\" is not a palindrome.");
        }

        input.close();
    }


    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
Example Outputs:

1. User input: "madam"
   The string "madam" is a palindrome.

2. User input: "hello"
   The string "hello" is not a palindrome.
*/
