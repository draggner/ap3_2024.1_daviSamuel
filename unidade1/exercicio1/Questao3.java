package unidade1.exercicio1;

import unidade1.exercicio1.Latao;
import java.util.Scanner;

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
