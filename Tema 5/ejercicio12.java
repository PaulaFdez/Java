import java.util.Scanner;

public class ejercicio12{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido;
    int a=;
    int b=1;
    int aux;
    
    System.out.println("Introduce el numero de dígitos que quieres que te dé de la secuencia Fibonnaci: ");
    numeroIntroducido = s.nextInt();
    
    for(int i=0; i<numeroIntroducido;i++){
      aux = a;
      a = a+b;
      b = aux;
      System.out.println(aux);
    }
    
  }
}
