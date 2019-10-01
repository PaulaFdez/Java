import java.util.Scanner;

public class ejercicio12{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    long bytesIntroducidos;
    long bytes;
    long kiloBytes;
    long megaBytes;
    long cociente; 
    
    System.out.print("Introduce los Bytes a introducir: ");
    bytesIntroducidos = s.nextLong();
    
    cociente = bytesIntroducidos / 1024; // aquí almaceno el resultado de la división para poder calcular el resto de las siguientes unidades.
    
    bytes = bytesIntroducidos % 1024;
    
    kiloBytes = cociente % 1024;
    
    megaBytes = cociente / 1024;
    
    System.out.println("El resultado es Bytes: " +bytes+ "   kilobytes: " +kiloBytes+ "   Megabytes: " +megaBytes);
    
    
    
    
    
  }
}
