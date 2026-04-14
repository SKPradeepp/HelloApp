package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        6Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Check condition using if-else if-else
        if (number > 0) {
            System.out.println("The number is Positive");
        }
        else if (number < 0) {
            System.out.println("The number is Negative");
        }
        else {
            System.out.println("The number is Zero");
        }

        // Close scanner
        input.close();
    }
}