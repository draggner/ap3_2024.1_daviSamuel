package br.com.davi.unidade1.exercicio2.pacote_comida;

public class Lanche {
  
  String item;
  double preco;

  public Lanche(String nome, double preco) {

  }

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }
  
  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }
  
  @Override
  public String toString() {
    return "Lanche [item=" + item + ", preco=" + preco + "]";
  }
}