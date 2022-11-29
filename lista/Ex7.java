//Area do quadrdo
package lista;

import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    Scanner scc = new Scanner(System.in);
    System.out.println("Digite o Lado:");

    double lado = scc.nextDouble();
    double area = Math.pow(lado,2);
    System.out.println("Area do quadrado:" + area);


  }
}
