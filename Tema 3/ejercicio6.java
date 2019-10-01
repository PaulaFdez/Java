import java.util.Scanner;

public class ejercicio6{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la base y la altura (en ese orden y separados por un espacio) del triángulo: ");
    double base = s.nextDouble();
    double altura = s.nextDouble();
    
    double area = (base * altura) / 2;
    
    System.out.print("El área de tu triángulo es: "+ area);
    
  }
}
