package isidro;
public class BombaDeCombustivel {
  private String   combustivel;
  private float     precoLitro;
  private float     qtdeLitros;
  private float     valorTotal;
  private boolean  emAbastecimento;

  public BombaDeCombustivel(String combustivel,
  float preco){
    this.combustivel     = combustivel;
    this.precoLitro      = preco;
    this.qtdeLitros      = 0f;
    this.valorTotal      = 0f;
    this.emAbastecimento = false;

  }

  public void puxarGancho() {
    this.emAbastecimento = true;
    System.out.println("Bomba"+this.combustivel+"Pronto para abastecer");
  }

  public void voltarGancho() {
    this.emAbastecimento = false;
    System.out.print("");

  }

  public void abastecerPorLitro(float litros) {
    if (this.emAbastecimento) {
      this.qtdeLitros = litros;
      this.valorTotal = this.qtdeLitros * this.precoLitro;
      System.out.print("Bomba"+combustivel+"em abastecimeto");
  } else {
    System.out.print("tire o bico do gancho");
    }   
  }

  public void abastecerPorValor(float valor){
    if (this.emAbastecimento) {
      this.valorTotal = valor;
      this.qtdeLitros = this.precoLitro / this.valorTotal; 
      System.out.print("Bomba"+combustivel+"em abastecimeto");

    } else {
      System.out.print("tire o bico do gancho");

    }
    
  }
}
