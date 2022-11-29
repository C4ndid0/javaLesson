//Media das notas.
package lista;

import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner scc = new Scanner(System.in);

    System.out.println("Entre com a primeira nota:");
    double nota01 = scc.nextDouble();

    System.out.println("Entre com a segunda nota:");
    double nota02 = scc.nextDouble();

    System.out.println("Entre com a terceira nota:");
    double nota03 = scc.nextDouble();

    System.out.println("Entre com a quarta nota:");
    double nota04 = scc.nextDouble();

    double media = (nota01 + nota02 + nota03 + nota04)/ 4;

    System.out.println("Media:" + media);
  }
}
