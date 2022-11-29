//Metros para Cm.
package lista;

import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Scanner scc = new Scanner(System.in);
    System.out.println("Valor em Metros");
    double metros = scc.nextDouble();
    double mInCm = metros * 100;
    System.out.println("Valor em cm:" + mInCm);

  }
}
