import java.util.Scanner;

public class ejercicio10{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    double numeroIntroducido;
    double media;
    double suma=0;
    int iCantidad = -1;
    
    
    do{
      System.out.println("Introduce un número: ");
      numeroIntroducido = s.nextDouble();
      suma = numeroIntroducido+suma;
      iCantidad++;
    } while (numeroIntroducido>0);
      
      suma = suma-numeroIntroducido;
      media = suma/iCantidad;
      System.out.println("Tu media es de: "+media);
    
  }
}
