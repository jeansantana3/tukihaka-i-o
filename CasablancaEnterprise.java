import java.util.Scanner;

public class SimpleJavaMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser();


        System.out.print("Enter a number montalvo: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another number wilson: ");
        int num2 = scanner.nextInt();
        int sum = addNumbers(num1, num2);
        System.out.println("Sum: " + sum);


        System.out.print("Enter a string monty: ");
        String str1 = scanner.next();
        System.out.print("Enter another string: ");
        String str2 = scanner.next();
        String concatenatedString = concatenateStrings(str1, str2);
        System.out.println("Concatenated String: " + concatenatedString);

       
        System.out.print("Enter a message: ");
        String message = scanner.next();
        printMessage(message);

        scanner.close();
    }


    public static void greetUser() {
        System.out.println("Hello! Welcome to Casablanca Enterprise");
    }


    public static int addNumbers(int a, int b) {
        return a + b;
    }


    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static String concatenateStrings(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

   
    public static void printMessage(String message) {
        System.out.println("Your message is: " + message);
    }
}

///W3SChools was used for the process.


       
