import java.util.Scanner;

public class ejercicio3{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    int dia;
    
    System.out.println("Introduce un número del 1 al 7 para que te diga a que dia de la semana corresponde: ");
    dia = s.nextInt();
    
    if ((dia <=0) || (dia >=8)){
      System.out.println("El número introducido no es correcto, introduce un número del 1 al 7: ");
      dia = s.nextInt();
    }
    
    switch (dia){
      
      case 1:
      System.out.println("Ese número corresponde al Lunes");
      break;
      
      case 2:
      System.out.println("Ese número corresponde al Martes ");
      break;
      
      case 3: 
      System.out.println("Ese número corresponde al Miércoles");
      break;
      
      case 4:
      System.out.println("Ese número corresponde al Jueves");
      
      case 5:
      System.out.println("Ese número corresponde al Viernes");
      break;
      
      case 6: 
      System.out.println("Ese número corresponde al Sábado");
      break;
      
      case 7:
      System.out.println("Ese número corresponde al Domingo");
      break;
    }
  }
}
