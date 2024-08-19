package unidade1.exercicio1;

import unidade1.exercicio1.Latao;
import java.util.Scanner;

/*
 * 3) Sabendo que latão é 70% de cobre e 30% de zinco, indique a quantidade de cada um desses componentes para se obter uma certa quantidade de quilos de latão que foi requerida pelo usuário.
 * COD: 695686780
 */

public class Questao3 {
  public static void main(String[] args) {
    Latao umLatao = new Latao();

    Scanner teclado = new Scanner(System.in);
    System.out.println(" ");
    System.out.println("Específicações desejada para fazer Latões");
    System.out.println("Informe a Quantidade em Kg: ");
    float valor = teclado.nextFloat();

    umLatao.setValor(valor);
    System.out.println("Resultado: " + umLatao.getValor() + "kg");
    System.out.println(" ");
    System.out.println("Específicações Necessárias - ");
    System.out.println("Quantidade de Cobre: " + umLatao.converterCobre(valor, umLatao.getCobre()) + " em quilogramas");
    System.out.println("Quantidade de Zinco: " + umLatao.converterZinco(valor, umLatao.getZinco()) + " em quilogramas");
    System.out.println("Recomendações acima para fazer os latão necessário.");
    
    teclado.close();
  }
}
