import java.util.Scanner;

public class ejercicio13{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido;
    int jCantidad =0;
    int kCantidad =0;
    
    for(int i=1; i<=10;i++){
      System.out.println("Introduce un número: ");
      numeroIntroducido = s.nextInt();
      if(numeroIntroducido>=0){
        jCantidad +=1;
      }else{
        kCantidad +=1;
      }
    }
    System.out.println("Has introducido "+jCantidad+" positivos y "+kCantidad+" negativos");
  }
}
//><
