package br.com.davi.unidade1.exercicio2.pacote_comida;

public class MainLanchonete {
  public static void main(String[] args) {
    Lanchonete fornoAlenha = new Lanchonete();
    Lanchonete pizzariaAlternativa = new Lanchonete();

    pizzariaAlternativa.listaPedidos();
    fornoAlenha.listaPedidos();

    pizzariaAlternativa.listarItens();
    fornoAlenha.listarItens();

    pizzariaAlternativa.fazerPedido("Davi Samuel", "Pizza de Franco Catupy");
  }
}