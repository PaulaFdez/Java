import java.util.Scanner;

public class ejercicio07{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    int contrasena = 1111;
    int numeroIntroducido;
    
    System.out.println("Introduce un número de 4 dígitos para abrir la caja fuerte: ");
    numeroIntroducido = s.nextInt();
    
    if(numeroIntroducido == contrasena){
      System.out.println("Has abierto la caja!");
    } else{
      System.out.println("No has acertado, tienes 3 oportunidades más. ");
      
      for(int i=1; i<4; i++){
        System.out.println("Introduce un número de 4 dígitos para abrir la caja fuerte: "); // Al poner este print dentro del bucle, sale por pantalla el print cada vez que da una vuelta.
        numeroIntroducido = s.nextInt();
      }
      System.out.println("Lo siento, no has acertado.");
    }
    
  }
}
