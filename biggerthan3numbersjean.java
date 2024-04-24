import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Write a number");
        double numero1 = lector.nextInt();
        
        System.out.println("Write a number");
        double numero2 = lector.nextInt();
       
        System.out.println("Write a number");
        double numero3 = lector.nextInt();
        
        if(numero1 > numero2 && numero1 > numero3) {
          System.out.println ("numero1 is greater");
        }
       else if(numero1<numero2 && numero2>numero3) {
            System.out.println("numero2 is greater");
    
        }
        else if(numero3>numero1 && numero3>numero2){
            System.out.println("Numero 3 is greater");
        }
        else{
            System.out.println("Numbers are equal");
        }
      
        lector.close();
    }
}