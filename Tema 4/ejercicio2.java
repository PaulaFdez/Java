import java.util.Scanner;

public class ejercicio2{
  public static void main (String []arg){
  
    Scanner s = new Scanner(System.in);
    float hora;
    
    System.out.println("Introduce la hora para que te salude correctamente :) :");
    hora = s.nextFloat();
    
    if ((hora >=6) && (hora <= 12)){
      System.out.println("Buenos Días!");
    }
    
    if ((hora >=13) && (hora <=20)){
      System.out.println("Buenas Tardes!");
    } 
    
    if ((hora >=21) && (hora <=24)){
      System.out.println("Buenas noches!");
    }
    
    if ((hora >=0) && (hora <=5)){
      System.out.println("Buenas noches!");
    }
  
  }
}
