import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Write a number");
        int numero = lector.nextInt();
        
        if(numero%2 == 0) {
          System.out.println ("That's even");
        }
        else {
            System.out.println("Odd bro");
    
        }
      
        lector.close();
    }
}