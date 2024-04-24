import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
         System.out.println("Write a number");
       int numero= lector.nextInt();
       int total=numero;
    for(int i = 0 ; i < numero; i++){
        System.out.println(i);
        total = (i+total);
    }
/*while (numero != 0) {
  System.out.println("Write a number");
      numero= lector.nextInt();
      
}*/
System.out.println("Answer is "+ total);
    }
}