import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
         System.out.println("Write a number");
       int numero= lector.nextInt();
       int total=numero;
while (numero != 0) {
  System.out.println("Write a number");
      numero= lector.nextInt();
      total = (numero+total);
}
System.out.println("Answer is "+ total);
    }
}