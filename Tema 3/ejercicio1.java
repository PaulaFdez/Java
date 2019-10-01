import java.util.Scanner;

public class ejercicio1{
  public static void main (String []arg){
    
    Scanner s = new Scanner (System.in);
    
    System.out.println("Introduce 2 numeros separados por un espacio: ");
    double num1 = s.nextDouble();
    double num2 = s.nextDouble();
    
    double multiplicacion = num1*num2;
    
    System.out.println("El resultado de la multiplicación es: "+multiplicacion);
  }
}
