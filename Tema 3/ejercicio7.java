import java.util.Scanner;

public class ejercicio7{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el importe total de la factura: ");
    double factura = s.nextDouble();
    
    
    System.out.print("Introduce el iva que deseas calcular: ");
    int iva = s.nextInt();
    
    
    double baseImponible = iva /100.0;
  
    
    double ivaCalculado = factura * baseImponible;
    
    
    double total = factura + ivaCalculado;
    
    System.out.println("El importe de tu factura es: " +total);
    System.out.print("Se le ha añadido: " +baseImponible);
    
    
  }
}
