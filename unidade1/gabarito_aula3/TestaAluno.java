package unidade1.gabarito_aula3;

public class TestaAluno {
  public static void main(String[] args) {
    Aluno davi = new Aluno();

    davi.setNome("Davi Samuel");
    
    davi.setNota1(10);
    davi.setNota2(10);
    davi.setNota3(10);

    System.out.println(" ");
    System.out.println("Informações do ALUNO");
    System.out.println("--------------------");
    
    System.out.println("Nome: " + davi.getNome());
    
    System.out.println(" ");
    
    System.out.println("Notas: \nUnidade I - " + davi.getNota1() + "\nUnidade II - " + davi.getNota2() + "\nUnidade III - " + davi.getNota3());
    
    System.out.println(" ");
    System.out.println("Nome Maíusculo: " + davi.getNomeMaiusculo());
    System.out.println("Nome Minúsculo: " + davi.getNomeMinusculo());

    System.out.println(" ");
    System.out.println("Média do Aluno: " + davi.getMedia());
    System.out.println("Aprovado: " + davi.getAprovado());

  }
}
