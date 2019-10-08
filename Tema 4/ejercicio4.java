import java.util.Scanner;

public class ejercicio4{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    int horas;
    int totalConExtras;
    int diferencia;
    int sueldoBase;
    int sueldoExtra;
    
    System.out.println("Introduce las horas trabajadas: ");
    horas = s.nextInt();
    
    if ((horas <=40) && (horas >=0)){
      sueldoBase = horas*12;
      System.out.println("Tu sueldo es de: "+sueldoBase);
    } else{
      diferencia = horas - 40;
      sueldoExtra = diferencia*16;
      totalConExtras = 40*12 + sueldoExtra;
      System.out.println("Tu sueldo es de: "+totalConExtras);
    }
    //Otra forma de hacerlo sería:
    // sueldoBase = (horas<=40)? horas:40;
    // sueldoExtra = (horas<=40)? 0 : horas-40;
  }
}
