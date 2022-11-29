//valor ganho por mes HTxVH.
package lista;

import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    
    Scanner scc = new Scanner(System.in);
    
    System.out.println("Horas Trabalhadas por mes:");
    double horasTrabalhadas = scc.nextDouble();

    System.out.println("Valor ganho por Hora trabalhada:");
    double valorHora = scc.nextDouble();

    double totalSalario = valorHora * horasTrabalhadas;


    System.out.println("Salario mensal:" + totalSalario);

  }
}
