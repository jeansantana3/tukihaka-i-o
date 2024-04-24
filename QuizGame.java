import java.util.Scanner;

public class SimpleJavaMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Method without parameters and return value
        greetUser();

        // Method with parameters and return value
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();
        int sum = addNumbers(num1, num2);
        System.out.println("Sum: " + sum);

        // Method overloading demonstration
        System.out.print("Enter a string: ");
        String str1 = scanner.next();
        System.out.print("Enter another string: ");
        String str2 = scanner.next();
        String concatenatedString = concatenateStrings(str1, str2);
        System.out.println("Concatenated String: " + concatenatedString);

        // Method without return value and with parameters
        System.out.print("Enter a message: ");
        String message = scanner.next();
        printMessage(message);

        scanner.close();
    }

    // Method without parameters and return value
    private static void greetUser() {
        System.out.println("Hello! Welcome to the simple Java methods program.");
    }

    // Method with parameters and return value
    private static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method overloading
    private static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    private static String concatenateStrings(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    // Method without return value and with parameters
    private static void printMessage(String message) {
        System.out.println("Your message is: " + message);
    }
}


