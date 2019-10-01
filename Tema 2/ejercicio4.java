    import java.util.Scanner;

public class ejercicio4{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce la cantidad a convertir en pesetas (Puede contener decimales): "); 
    double euros = s.nextDouble();
    double pesetas = 166.386;
    
    double conversion= euros * pesetas;
    
    System.out.println("Tu conversión a pesetas es: "+conversion);
    
    
  }
}
