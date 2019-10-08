import java.util.Scanner;

public class ejercicio2{
  public static void main (String []arg){
  
    Scanner s = new Scanner(System.in);
    float hora;
    
    System.out.println("Introduce la hora para que te salude correctamente :) :");
    hora = s.nextFloat();
    
   // if ((hora >=6) && (hora <= 12)){
   //    System.out.println("Buenos Días!");
   // }
    
   // if ((hora >=13) && (hora <=20)){
   //   System.out.println("Buenas Tardes!");
   // } 
    
   // if ((hora >=21) && (hora <=24)){
   //  System.out.println("Buenas noches!");
   // }
    
   // if ((hora >=0) && (hora <=5)){
   //  System.out.println("Buenas noches!");
   // }
    
    if ((hora >=6) && (hora <= 12)){
      System.out.println("Buenos Días!");
    } else if ((hora >=13) && (hora <=20)){
      System.out.println("Buenas Tardes!");
    } else if ((hora >=21) && (hora <=24)){
      System.out.println("Buenas noches!");
    } else if ((hora >=0) && (hora <=5)){
      System.out.println("Buenas noches!");
    }
    
    //Esta última forma sería más correcta ya que el programa es más eficiente. 
    //Tambíen podríamos haberlo hecho con un switch, declarando
    //switch (num) {
    //case 1: case 2: case 3:
    //stuff
    // break;
    //case 4: case 5: case 6: 
    //more stuff
    //break;
    //default:
}
        
  }
}
