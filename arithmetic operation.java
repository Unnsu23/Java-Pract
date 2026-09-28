package first;

import java.util.Scanner;

public class aritmectic{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nResults:");

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
            System.out.println("Modulus: " + (num1 % num2));
        } else {
            System.out.println("Division and modulus not possible (division by zero)");
        }

        sc.close();
    }
}