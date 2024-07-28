public class Aluno {

  String nome;
  int matricula;
  double nota1;
  double nota2;
  double nota3;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public double getNota1() {
    return nota1;
  }

  public void setNota1(double nota1) {
    this.nota1 = nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public void setNota2(double nota2) {
    this.nota2 = nota2;
  }

  
  public double getNota3() {
    return nota3;
  }

  public void setNota3(double nota3) {
    this.nota3 = nota3;
  }

  public double setMediaFinal() {
    return (nota1 + nota2 + nota3) / 3;
  }

  public String setAprovado() {
    if (setMediaFinal() >= 7) {
      return "Aprovado";
    } else {
      return "Reprovado";
    }
  }
}
