    import java.util.Scanner;

public class ejercicio8{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce 5 caracteres separados por un espacio: ");
    String a = s.next();
    String b = s.next();
    String c = s.next();
    String d = s.next();
    String e = s.next();
    
    String conjunto = a+b+c+d+e;
    System.out.println("Has escrito: " +conjunto);
    
  }
}

