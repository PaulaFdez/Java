import java.util.Scanner;

public class ejercicio08{
  public static void main (String []arg){
  
    Scanner s = new Scanner(System.in);
  
    int numeroIntroducido;
    int multiplicar;
  
    System.out.println("Introduce un número para decirte su tabla de multiplicar: ");
    numeroIntroducido = s.nextInt();
  
    for(int i=1; i<=10; i++){
      multiplicar = numeroIntroducido * i;
      System.out.println(multiplicar);
    }
  }
}
