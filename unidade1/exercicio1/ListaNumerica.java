package unidade1.exercicio1;

/**
 * Class Lista Numérica
 * 
 * - Este programa informa uma sequência de números aleatórios em uma lista de 9999 números, no qual o objetivo é fazer o comparativo de cada valor aleatório inserido nesta respectiva lista e dentre os 9999 valores, qual será o menor de todos.
 * 
 * @author Davi Samuel G. A.
 * @version 1.0
 * @since 2024-08-17
 * 
 * COD: 695686780
*/

public class ListaNumerica {
  int valor = 0;
  int valorTotal = 0;

  public int getValorTotal() {
    return valorTotal;
  }

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }
  
  public void setValorTotal(int valorTotal) {
    this.valorTotal = valorTotal;
  }

}
