package lista;

import java.util.Random;

public class Ex19 {
  public static void main(String[] args) {
    int[][] numerosAleatorios = new int[4][4];

    Random randomNumber = new Random();
    for(int i = 0; i < numerosAleatorios.length; i++){
      for(int j = 0; j<numerosAleatorios[i].length;i++){
        numerosAleatorios[i][j] = randomNumber.nextInt();
      }
    }
    int maior = 0;
    int linha = 0;
    int col = 0;

    for (int i = 0; i < numerosAleatorios.length;i++){
      for (int j = 0; j < numerosAleatorios[i].length;i++){
        if(numerosAleatorios[i][j] > maior){
          maior = numerosAleatorios[i][j];
          linha = i;
          col = j; 
        }
      }
    }
    
    System.out.println("Maior valor:" + maior);
    System.out.println("linha:" + linha);
    System.out.println("coluna:" + col);

  } 
}
