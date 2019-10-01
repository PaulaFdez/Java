import java.util.Scanner;

public class ejercicio5{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura y altura (separados por un espacio) del rectángulo del cual deseas que calcule el área: ");
    int altura = s.nextInt();
    int base = s.nextInt();
    
    int area = altura*base;
    
    System.out.print("El área del rectangulo es: "+ area);
  }
}
