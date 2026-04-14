package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter age:");

        // Check if input is a valid integer
        if (input.hasNextInt()) {

            int age = input.nextInt();

            // Decision making using if-else
            if (age >= 18) {
                System.out.println("Person can vote");
            } else {
                System.out.println("Person cannot vote");
            }

        } else {
            System.out.println("Invalid input. Please enter a valid age.");
        }

        // Close scanner
        input.close();
    }
}