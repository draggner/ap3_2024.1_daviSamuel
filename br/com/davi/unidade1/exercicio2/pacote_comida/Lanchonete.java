package br.com.davi.unidade1.exercicio2.pacote_comida;

import java.util.List;

public class Lanchonete {
  List<Lanche> pedidos;

  // public Lanchonete() {
  //   lanches = new LinkedList<>();
  // }

  public List<Lanche> getPedidos() {
    return pedidos;
  }

  public void setPedidos(List<Lanche> pedidos) {
    this.pedidos = pedidos;
  }

  public void listarItens(String item) {
      
  }

  public void listarPedidos() {
    for (Lanche lanche : pedidos) {
      System.out.println(lanche);
    }
  }

  protected void fazerPedido(String cliente, Lanche lanche) {
    pedidos.add(lanche);
   
  }
}