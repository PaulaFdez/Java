import java.util.Scanner;

public class ejercicio11{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido;
    int cuadrado;
    int cubo;
    
    for(int i=0; i<5; i++){     //Como puedo almacenar los 5 numeros, para despues mostrarlos por pantalla del tiron.
      System.out.println("Introduce un número entero para que te devuelva su cuadrado y su cubo: ");
      numeroIntroducido = s.nextInt();
      cuadrado = (int) Math.pow(numeroIntroducido,2);
      cubo = (int) Math.pow(numeroIntroducido, 3);
      System.out.println("El cuadrado de "+numeroIntroducido+" es: "+cuadrado+" y su cubo es: "+cubo);
    }
  }
}
