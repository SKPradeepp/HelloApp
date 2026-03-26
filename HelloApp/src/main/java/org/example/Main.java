package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        String greeting;
        if (args.length > 0) {
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        } else {
            greeting = "Hello, World!";
        }
        System.out.println(greeting);
    }
}