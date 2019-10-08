import java.util.Scanner;

public class ejercicio7{
  public static void main (String []arg){
    
     Scanner s = new Scanner(System.in);
     float nota1;
     float nota2;
     float nota3;
     float media;
     
     System.out.println("Introduce tres notas separadas por un espacio para calcular tu media");
     nota1 = s.nextFloat();
     nota2 = s.nextFloat();
     nota3 = s.nextFloat();
     
     if (nota1 || nota2 || nota3 < 0){
        System.out.println("Introduce otra vez todas las notas que sean superior a 0 por favor: ");
        nota1 = s.nextFloat();
        nota2 = s.nextFloat();
        nota3 = s.nextFloat();
      }
     
     media = (nota1 + nota2 + nota3) / 3;
     
     System.out.println("Tu nota media es: "+media);
     
     
     
  }
}
