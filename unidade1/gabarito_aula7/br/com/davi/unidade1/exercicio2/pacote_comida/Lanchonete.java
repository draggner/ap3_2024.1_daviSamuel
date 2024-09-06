package br.com.davi.unidade1.exercicio2.pacote_comida;

import java.util.LinkedList;
import java.util.List;

public class Lanchonete {
  List<Lanche> pedidos;

  public Lanchonete() {
    pedidos = new LinkedList<>();
  }

  public List<Lanche> getPedidos() {
    return pedidos;
  }

  public void setPedidos(List<Lanche> pedidos) {
    this.pedidos = pedidos;
  }

  public void listarItens() {
    for (int i = 0; i < pedidos.size(); i++) {
      System.out.println(pedidos.get(i).getItem());
    }
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