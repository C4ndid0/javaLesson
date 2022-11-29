// F to C
package lista;
import java.util.Scanner;
public class Ex9 {
  public static void main(String[] args) {
    Scanner scc = new Scanner(System.in);

    System.out.println("Temperatura em Farenheit:");
    double fh = scc.nextDouble();
    
    double celsius = (5*(fh - 32)/ 9);
    System.out.println("Temperatura em Celsius:" + celsius);

  }
}
