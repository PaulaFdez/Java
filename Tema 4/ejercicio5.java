import java.util.Scanner;

public class ejercicio5{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    double a;
    double b;
    double x;
    
    
    System.out.println("Este programa resuleve ecuaciones del tipo ax + b =0.");
    System.out.println("Introduce el valor de a: ");
    a = s.nextInt();
    
    System.out.println("Introduce el valor de b: ");
    b = s.nextInt();
    
    b = b*(-1);
    
    x= b/a;
    
    System.out.println("El resultado es: "+x);
    
    
    
  }
}
