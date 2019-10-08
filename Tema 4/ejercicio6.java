import java.util.Scanner;
import java.lang.Math;

public class ejercicio6{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    float h;
    double fraccion;
    float raiz;
    
    System.out.println("Introduce el valor de h, sólo valores positivos, por favor: ");
    h = s.nextFloat();
    
    if (h<=0){
      System.out.println("Introduce un número positivo, por favor: ");
      h = s.nextFloat();
    } else{
      fraccion = (float) (2*h) / 9.81;
      raiz = (float) Math.sqrt(fraccion);
      System.out.println("El resultado de t es: "+raiz);
      
    }
    
  }
}
