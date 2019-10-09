import java.util.Scanner;

public class ejercicio09{
  public static void main (String []arg){
  
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido;
    int iCantidad=0;
    
    System.out.println("Introduce un número para que te devuelva el número de dígitos: ");
    numeroIntroducido = s.nextInt();
    
    while(numeroIntroducido>0){     //porque no puedo poner >=? 
      numeroIntroducido = numeroIntroducido/10;
      iCantidad++;
    }
    System.out.println("Tu número tiene "+iCantidad+" dígitos.");
  }
}

