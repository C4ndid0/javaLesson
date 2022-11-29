// Soma de dois numeros.
package lista;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner scc = new Scanner(System.in);
    System.out.println("digite 1 numero:");
    int num1 = scc.nextInt();
    System.out.println("digite outro numero:");

    int num2 = scc.nextInt();
    System.out.println("A soma total é: " + (num1 + num2));

  }
}
