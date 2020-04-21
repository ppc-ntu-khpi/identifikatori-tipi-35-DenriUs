package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int displacementValue;
        String inputString;

        System.out.println("Enter string to encrypt: ");
        inputString = keyboard.nextLine();

        do {
            System.out.println("String to encrypt: " + inputString);
            System.out.println("\nEnter a numeric value of the displacement: ");

            while (!keyboard.hasNextInt()) {
                String input = keyboard.nextLine();

                System.out.println("'" + input +"'" + " is not a number");
                System.out.println("String to encrypt: " + inputString);
                System.out.println("\nEnter a numeric value of the displacement: ");
            }

            displacementValue = keyboard.nextInt();
        } while (displacementValue < 0);

        keyboard.close();

        System.out.println("Result: " + Exercise.Calculate(inputString, displacementValue));
    }
}
