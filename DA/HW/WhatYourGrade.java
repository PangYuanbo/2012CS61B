// YUANBO PANG - CIS 35A
// Giving the grade depending on the input score

import java.util.Scanner;

public class WhatYourGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your score: ");
        double score = input.nextDouble();

        if (score >= 90.0) {
            System.out.println("A");
        } else if (score >= 80.0) {
            System.out.println("B");
        } else if (score >= 70.0) {
            System.out.println("C");
        } else if (score >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        input.close();
    }
}

/*
Your result:
Please enter your score: 95
A

Please enter your score: 72
C
*/