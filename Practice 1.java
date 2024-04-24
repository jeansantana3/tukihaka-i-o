/////1

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Write your first number");
        double numero1 = lector.nextInt();
        
        System.out.print("Write your second number");
        double numero2 = lector.nextInt();
       
        System.out.print("Write your final number");
        double numero3 = lector.nextInt();
        
        double average = (numero1 + numero2 + numero3)/3;
        
        System.out.println("Your average is: " + average);
    }
    
}




/////2 
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");

    
        int choice = scanner.nextInt();

    
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", celsius, fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
         
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit is %.2f Celsius\n", fahrenheit, celsius);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }
}


///// 3
import java.util.Scanner;

public class SwapUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = scanner.nextInt();

        System.out.println("Enter the second number:");
        int b = scanner.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);

        scanner.close();
    }
}

//// 4
public class PrintNaturalNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i);
        }
    }
}

////5

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number for which you want the multiplication table:");
        int number = scanner.nextInt();

        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

/////6

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}


///7

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}

/////8

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the side of the square:");
        double side = scanner.nextDouble();

        double area = side * side;

        System.out.println("The area of the square is: " + area);

        scanner.close();
    }
}


//////9

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}

/////10

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

        System.out.println("Is the year " + year + " a leap year? " + isLeapYear);

        scanner.close();
    }
}



