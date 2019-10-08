import java.util.Scanner;

public class ejercicio1{
  public static void main (String []arg){
  
    Scanner s = new Scanner(System.in);
    
    int dia;
    
    System.out.println("Introduce uno de los siguientes numeros para saber que tienes a primera hora ese día: ");
    System.out.println("1. Lunes");
    System.out.println("2. Martes");
    System.out.println("3. Miércoles");
    System.out.println("4.Jueves");
    System.out.println("5. Viernes");
    
    dia = s.nextInt();
    
    switch (dia){
      
      case 1:
      System.out.println("El lunes tienes LM");
      break;
      
      case 2:
      System.out.println("El martes tienes PRO");
      break;
      
      case 3: 
      System.out.println("El miércoles tienes ED");
      break;
      
      case 4:
      System.out.println("El jueves tienes PRO");
      break;
      
      case 5: 
      System.out.println("El viernes tienes FOL");
      break;
      
    }
    
  }
}
