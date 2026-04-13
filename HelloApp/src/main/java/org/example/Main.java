package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        String greeting;

        // Check if no arguments are provided
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Join all names with comma and space
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        // Print the greeting
        System.out.println(greeting);
    }
}