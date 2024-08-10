package unidade1.gabarito_aula5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import unidade1.gabarito_aula4.Aluno;

public class TestaAlunoScanner {
  public static void main(String[] args) {
    
    Aluno umAluno = new Aluno();
    Scanner teclado = new Scanner(System.in);
    
    System.out.println();
    System.out.println("Informe o nome do Aluno: ");
    
    //Imprimindo um Aluno
    String nomeAluno = teclado.nextLine();
    umAluno.setNome(nomeAluno);
    System.out.println(umAluno);
    
    //Imprimindo Nota 01
    System.out.println();
    System.out.println("Informe Nota 01: ");
    double nota1 = teclado.nextDouble();
    umAluno.setNota1(nota1);
    System.out.println(umAluno);

    //Imprimindo Nota 02
    System.out.println();
    System.out.println("Informe Nota 02: ");
    double nota2 = teclado.nextDouble();
    umAluno.setNota2(nota2);
    System.out.println(umAluno);

    //Imprimindo Nota 03
    System.out.println();
    System.out.println("Informe Nota 03: ");
    double nota3 = teclado.nextDouble();
    umAluno.setNota3(nota3);
    System.out.println(umAluno);

    //Imprimindo NomeDaMae
    System.out.println();
    System.out.println("Informe o Nome da Mãe: ");
    String nomeDaMae = teclado.next();
    umAluno.setNomeDaMae(nomeDaMae);
    System.out.println(umAluno);

    //Imprimindo DataNascimento
    System.out.println();
    System.out.println("Informe a Data Nascimento (Formato dd-MM-yyyy): ");
    DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String dataNascimentoString = teclado.next();
    LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, formatar);
    umAluno.setDataNascimento(dataNascimento);
    System.out.println(umAluno);

    System.out.println("Há 137 dias depois: " + dataNascimento.minusDays(137));

    teclado.close();
  }

}