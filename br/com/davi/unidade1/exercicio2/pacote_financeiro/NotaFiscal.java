package br.com.davi.unidade1.exercicio2.pacote_financeiro;

import br.com.davi.unidade1.exercicio2.pacote_comida.Lanche;
import br.com.davi.unidade1.exercicio2.pacote_comida.Lanchonete;

public class NotaFiscal {
  public static void main(String[] args) {
    Lanche pizzaFrango = new Lanche("Pizza de Frango", 20.00);
    Lanchonete pizzariaDaCasa = new Lanchonete();
    
    pizzariaDaCasa.fazerPedido("Pizza de File com Fritas", pizzaFrango);
  }
}