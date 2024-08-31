package br.com.davi.unidade1.exercicio2.pacote_comida;

public class MainLanchonete {
  public static void main(String[] args) {
    Lanche pizzaCatupiry = new Lanche("Pizza de Frango Catupiry", 20.00);
    Lanche pizzaFileFritas = new Lanche("Pizza de File com Fritas", 40.00);
    Lanche pizzaCalabresa = new Lanche("Pizza de Calabresa", 67.99);

    Lanchonete fornoAlenha = new Lanchonete();

    fornoAlenha.fazerPedido("Davi Samuel", pizzaCatupiry);
    fornoAlenha.fazerPedido("Davi Samuel", pizzaFileFritas);
    fornoAlenha.fazerPedido("Davi Samuel", pizzaCalabresa);

    fornoAlenha.listarPedidos();
  }
}