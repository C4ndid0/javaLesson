//Area do circulo
package lista;

import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    Scanner scc = new Scanner(System.in);
    System.out.println("Digite o raio:");
    double raio = scc.nextDouble();

    double area = Math.PI * Math.pow(raio, 2);
    System.out.println("Area:" + area);

  }
}
