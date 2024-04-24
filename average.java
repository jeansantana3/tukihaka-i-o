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