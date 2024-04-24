import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("What is your age?");
        int numero = lector.nextInt();
        
        if(numero>=18) {
          System.out.println ("You're in brother");
        }
        else {
            System.out.println("You a minor brother");
    
        }
      
        lector.close();
    }
}