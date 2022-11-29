package lista;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner scc = new Scanner(System.in);

    System.out.println("Digite o num1:");
    int num1 = scc.nextInt();
    
    System.out.println("Digite o num2:");
    int num2 = scc.nextInt();
    
    System.out.println("Digite o num3:");
    int num3 = scc.nextInt();

    // o produto do dobro do primeiro mais metade do segundo

    int c1 = (num1 * 2) + (num2 / 2);
    System.out.println("Condicao a:" + c1 );
    
    //a soma do triplo do primeiro com o terceiro
    int c2 = (num1 * 3) + num3;
    System.out.println("Condicao b:" + c2);

    // o terceiro elevado ao cubo
    int c3 = (int) Math.pow(num3,3);
    System.out.println("Condicao c:" + c3);
    
  }
}
