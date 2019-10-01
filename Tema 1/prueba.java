public class prueba{
  public static void main (String []arg){
    
    float num1;
    float num2; 
    
    num1= (float) 2.4; //ponemos (float) para que el programa haga la conversión a flotante ya que lo detecta como double y lo almacena en esa variable.
    num2= (float) 5.6; 
    
    double suma= num1 + num2;
    double resta= num1 - num2;
    
    System.out.println("El resultado es " + suma);
    System.out.println("El resultado es " + resta);
    
  }
}
