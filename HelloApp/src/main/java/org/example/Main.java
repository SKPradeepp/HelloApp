package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Check if valid natural number
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                // Check even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        input.close();
    }
}