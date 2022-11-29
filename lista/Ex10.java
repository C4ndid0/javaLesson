// C to F
package lista;

import java.util.Scanner;
public class Ex10 {
  public static void main(String[] args) {
    Scanner scc = new Scanner(System.in);

    System.out.println("Temperatura em Celsius:");
    double c = scc.nextDouble();
    
    double farenheit = ((c * 1.8) + 32);
    System.out.println("Temperatura em Farenheit:" + farenheit);

  }
}  

