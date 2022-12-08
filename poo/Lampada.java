package poo;

public class Lampada {
  private String modelo;
  private String tensao;
  private int potencia;
  private double price;
  private boolean ligada;

	public String getTensao() {
		return this.tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isLigada() {
		return this.ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}


  public String getModelo(){
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

}
