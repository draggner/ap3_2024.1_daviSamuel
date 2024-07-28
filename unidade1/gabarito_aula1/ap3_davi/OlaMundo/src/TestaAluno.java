public class TestaAluno {
  public static void main(String[] args) {

    Aluno jhonatanGael = new Aluno();
    jhonatanGael.setNome("Jhonatan Gael");
    jhonatanGael.setMatricula(15);
    jhonatanGael.setNota1(8);
    jhonatanGael.setNota2(7);
    jhonatanGael.setNota3(10);

    Aluno joaoGabriel = new Aluno();
    joaoGabriel.setNome("João Gabriel");
    joaoGabriel.setMatricula(78);
    joaoGabriel.setNota1(4);
    joaoGabriel.setNota2(8);
    joaoGabriel.setNota3(2);

    // Aluno 01
    System.out.println("\n---Informações de Alunos---");
    System.out.println(" ");
    System.out.println("Aluno - Matricula: " + jhonatanGael.getMatricula());
    System.out.println("Nome do Aluno: " + jhonatanGael.nome.toString());
    System.out.println("Notas: \nBimestre I: " + jhonatanGael.getNota1() + "\nBimestre II: " + jhonatanGael.getNota2()
        + "\nBimestre III: " + jhonatanGael.getNota3());
    System.out.println("\nAprovado ou Reprovado? " + jhonatanGael.setAprovado());
    
    System.out.println(" ");
    
    // Aluno 02
    System.out.println("Aluno - Matricula: " + joaoGabriel.getMatricula());
    System.out.println("Nome do Aluno: " + joaoGabriel.getNome());
    System.out.println("Notas: \nBimnestre I: " + joaoGabriel.getNota1() + "\nBimestre II: " + joaoGabriel.getNota2()
        + "\nBimestre III: " + joaoGabriel.getNota3());
    System.out.println("\nAprovado ou Reprovado? " + joaoGabriel.setAprovado());
  }
}