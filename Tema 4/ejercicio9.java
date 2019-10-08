import java.util.Scanner;
import java.lang.Math;

public class ejercicio9{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    int a;
    int b;
    int c;
    float x;
    float x1;
    float x2;
    double raiz;
    int calculoPrevio;
    
    System.out.println("Introduce el valor de a,b y c con espacios separados: ");
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    
    if (a==0){
      if(b != 0){  //hemos añadido esta condición para que sino saque por pantalla que la solución no es real.
        x = -(c)/b;
        System.out.println("El resultado es: "+x);
      }else{
        System.out.print("No hay un solución real");
      }
      
      } else{
      calculoPrevio = (b*b)-(4*a*c);
      raiz = (float) Math.sqrt(calculoPrevio);
      x1 = (float)(-1*b - raiz) / (2*a);
      x2 = (float)(-1*b + raiz) / (2*a);
      System.out.println("El resultado de x1 es: "+x1+" Y el resultado de x2 es: "+x2);
    }
    
  }
}
