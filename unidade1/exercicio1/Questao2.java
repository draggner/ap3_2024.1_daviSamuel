package unidade1.exercicio1;

import java.util.LinkedList;
import java.util.Random;

/*
 * 2) Em um método main, faça um programa que exiba para o usuário o menor inteiro positivo de uma lista ligada de 9999 npumeros gerados aleatoriamente.
 * COD: 695686780
 */

public class Questao2 {
  public static void main(String[] args) {
    int menorNum = 0;
    LinkedList<Integer> listaNumerica = new LinkedList<>();
    for (int i = 0; i < 5; i++) {
      Random aleatorio = new Random();

      int temp = aleatorio.nextInt(10000);
      listaNumerica.add(temp);
      System.out.println(" ");
      System.out.println("Valores da Lista: " + listaNumerica);
      for (int j = 0; j < listaNumerica.size(); j++) {
        System.out.println(" Passei Aqui ");
        // 1 Implementar a lógica de percorrer a lista
        // 2 Verificação do [Índice atual] da lista para o próximo
        // 2.1 Pegar o valor do Indice atual
        System.out.println(listaNumerica.get(j));
        int numAtual = temp;
        // 2.2 Pegar o valor do Indice do Próximo
        System.out.println(listaNumerica.getLast());
        int numProximo = listaNumerica.getLast();

        int listTemp = 0;
        if (numAtual <= numProximo) {
          listTemp = numAtual;
          menorNum = listTemp;
        } else {
          listTemp = numProximo;
          menorNum = listTemp;
        }

        System.out.println("Resultado: " + menorNum);
      }
    }
  }
}
