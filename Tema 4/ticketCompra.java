import java.util.Scanner;
//import java.text.DecimalFormat;

public class ticketCompra{
  public static void main (String []arg){
    
    Scanner s = new Scanner(System.in);     
    //DecimalFormat formato1 = new DecimalFormat("#.00");    
    
    String producto1, producto2, producto3, producto4;                              //VARIABLES
    int cantidad1, cantidad2, cantidad3, cantidad4;
    float precio1, precio2, precio3, precio4;
    float iva1, iva2, iva3, iva4;
    float importeTotal, importeIva, totalConIva;
    
    System.out.println("Introduce el nombre del primer producto: ");                //PRIMER PRODUCTO
    producto1 = s.nextLine();
    
    System.out.println("Ahora introduce su cantidad, su precio y el iva que deseas añadir todo ello separado por un espacio: "); 
    cantidad1 = s.nextInt();
    precio1 = s.nextFloat();
    iva1 = s.nextFloat();
    //if (s != null) No es necesario hacer la condición, con la setencia funciona igualmente.{
      s.nextLine();
    //}
    
    
    
    System.out.println("Introduce el nombre del segundo producto: ");                //SEGUNDO PRODUCTO
    producto2 = s.nextLine();
    
    System.out.println("Ahora introduce su cantidad, su precio y el iva que deseas añadir todo ello separado por un espacio: "); 
    cantidad2 = s.nextInt();
    precio2 = s.nextFloat();
    iva2 = s.nextFloat();
    if (s != null){
      s.nextLine();
    }
    
    
    
    System.out.println("Introduce el nombre del tercer producto: ");                //TERCER PRODUCTO
    producto3 = s.nextLine();
    
    System.out.println("Ahora introduce su cantidad, su precio y el iva que deseas añadir todo ello separado por un espacio: "); 
    cantidad3 = s.nextInt();
    precio3 = s.nextFloat();
    iva3 = s.nextFloat();
    if (s != null){
      s.nextLine();
    }
    
    
    
    System.out.println("Introduce el nombre del cuarto producto: ");                //CUARTO PRODUCTO
    producto4 = s.nextLine();
    
    System.out.println("Ahora introduce su cantidad, su precio y el iva que deseas añadir todo ello separado por un espacio: "); 
    cantidad4 = s.nextInt();
    precio4 = s.nextFloat();
    iva4 = s.nextFloat();
    if (s != null){
      s.nextLine();
    }
    
    
    
    precio1 = precio1*cantidad1;                                                     //PRECIOS Y CANTIDADES
    precio2 = precio2*cantidad2;
    precio3 = precio3*cantidad3;
    precio4 = precio4*cantidad4;
    
    
    
    iva1 = (float)precio1 * (iva1/100);                                              //IVAS
    iva2 = (float)precio2 * (iva2/100); 
    iva3 = (float)precio3 * (iva3/100); 
    iva4 = (float)precio4 * (iva4/100); 
    
    
    
    importeTotal = precio1 + precio2 + precio3 + precio4;                            //ImporteTotal
    
    
    importeIva = iva1 + iva2 + iva3 + iva4;                                          //ImporteIVA
    
    
    totalConIva = (precio1+iva1) + (precio2+iva2) + (precio3+iva3) + (precio4+iva4); //TotalConIVA
    

    
    
    System.out.println("                        MERCADONA S.A");                                             //ElSeñorTicket
    System.out.println("----------------------------------------------------------------");
    System.out.printf("%-10s      %10s        %10s        %10s\n", "Producto", "Cantidad", "Precio", "IVA");
    System.out.printf("%-10s      %12d        %6.2f        %6.2f\n", producto1, cantidad1, precio1, iva1);
    System.out.printf("%-10s      %12d        %6.2f        %6.2f\n", producto2, cantidad2, precio2, iva2);
    System.out.printf("%-10s      %12d        %6.2f        %6.2f\n", producto3, cantidad3, precio3, iva3);
    System.out.printf("%-10s      %12d        %6.2f        %6.2f\n", producto4, cantidad4, precio4, iva4);
    System.out.println("----------------------------------------------------------------");
    System.out.printf("%-10s                      %10.2f\n", "Importe total (sin IVA)", importeTotal);
    System.out.printf("%-10s                      %10.2f\n", "Importe IVA", importeIva);
    System.out.printf("%-10s                      %10.2f\n", "Importe total con IVA", totalConIva);
    
  }
}
