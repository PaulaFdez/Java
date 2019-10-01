    import java.util.Scanner;
    
public class ejercicio6{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el total de tu factura sin el iva: ");
    double totalFactura = s.nextDouble();
    
    double conversion = totalFactura * 1.21;
    
    double diferencia = conversion - totalFactura;
    
    System.out.println("Tu factura con IVA es: " +conversion);
    System.out.println("El IVA es: " +diferencia);
  }
}
