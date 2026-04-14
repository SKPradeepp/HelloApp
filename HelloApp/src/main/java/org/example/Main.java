package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (input.hasNextInt()) {

            int number = input.nextInt();

            boolean isEven = (number % 2 == 0);

            System.out.println("Is number even? " + isEven);

        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        input.close();
    }
}