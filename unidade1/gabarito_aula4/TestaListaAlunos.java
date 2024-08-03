package unidade1.gabarito_aula4;

import java.util.LinkedList;

public class TestaListaAlunos {
  public static void main(String[] args) {    
    LinkedList<Aluno> osAlunos = new LinkedList<Aluno>();
    for (int i = 0; i < 89764; i++) {
      Aluno umAluno = new Aluno();

      umAluno.setNome("AlunoNumero" + i);
      osAlunos.add(umAluno);

    }

    System.out.println("Imprimindo a Lista Alunos");

    for (int i = 0; i < osAlunos.size(); i++) {
      System.out.println(osAlunos.get(i));
    }
  }
}
