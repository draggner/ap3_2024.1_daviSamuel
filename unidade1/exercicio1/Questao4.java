package unidade1.exercicio1;

import unidade1.exercicio1.Contato;

public class Questao4 {
  public static void main(String[] args) {
    Contato contatoUm = new Contato("Leonardo da Vinci", "+39 99880-00");

    Contato contatoDois = new Contato("Michelangelo", "+06 99876-11");

    Contato contatoTres = new Contato("Donatello", "+39 99822-33");

    System.out.println(" ");
    System.out.println("Contato 01 -");
    System.out.println("Nome: " + contatoUm.getNome());
    System.out.println("Telefone: " + contatoUm.getTelefone());
    System.out.println("Exibir toString: " + contatoUm);

    System.out.println(" ");
    System.out.println("Contato 02 -");
    System.out.println("Nome: " + contatoDois.getNome());
    System.out.println("Telefone: " + contatoDois.getTelefone());
    System.out.println("Exibir toString: " + contatoDois);
    
    System.out.println(" ");
    System.out.println("Contato 03 -");
    System.out.println("Nome: " + contatoTres.getNome());
    System.out.println("Telefone: " + contatoTres.getTelefone());
    System.out.println("Exibir toString: " + contatoTres);
  }
}
