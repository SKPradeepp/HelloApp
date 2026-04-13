package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        StringBuilder names = new StringBuilder();

        // Check if no arguments are provided
        if (args.length == 0) {
            names.append("World");
        } else {

            for (String name : args) {

                // Add comma only if not first element
                if (names.length() > 0) {
                    names.append(", ");
                }

                names.append(name);
            }
        }

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}