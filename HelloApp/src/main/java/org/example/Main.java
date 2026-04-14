package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = input.nextInt();

        boolean isLeap = false;

        // Check Gregorian rule
        if (year >= 1582) {

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        input.close();
    }
}