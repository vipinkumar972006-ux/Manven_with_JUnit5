
package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator_combine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. ADD");
            System.out.println("2. SUBTRACT");
            System.out.println("3. MULTIPLY");
            System.out.println("4. EXIT");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number from 1 to 4.");
                continue;
            }

            switch (choice) {
                case 1:
                    int a = readNumber(sc, "Enter first number: ");
                    int b = readNumber(sc, "Enter second number: ");
                    int c = readNumber(sc, "Enter third number: ");
                    System.out.println("Result: " + add.addoperation(a, b, c));
                    break;

                case 2:
                    int x = readNumber(sc, "Enter first number: ");
                    int y = readNumber(sc, "Enter second number: ");
                    int z = readNumber(sc, "Enter third number: ");
                    System.out.println("Result: " + sub.suboperation(x, y, z));
                    break;

                case 3:
                    int p = readNumber(sc, "Enter first number: ");
                    int q = readNumber(sc, "Enter second number: ");
                    int r = readNumber(sc, "Enter third number: ");
                    int s = readNumber(sc, "Enter fourth number: ");
                    System.out.println("Result: " + mul.muloperation(p, q, r, s));
                    break;

                case 4:
                    System.out.println("Exiting calculator...");
                    sc.close();
                    return;

                default:
                    System.out.println("Choose from 1 to 4");
            }
        }
    }

    private static int readNumber(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
}
