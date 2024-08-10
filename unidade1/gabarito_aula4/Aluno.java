package unidade1.gabarito_aula4;

import java.time.LocalDate;

public class Aluno {
  
  String nome = "SemNome";
  double nota1 = 5;
  double nota2 = -1;
  double nota3 = -1;
  String nomeDaMae = "Maezinha";
  boolean aprovadoMedia = false;
  LocalDate dataNascimento = null;
  LocalDate dataCadastro = LocalDate.now();
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
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
  
  public boolean isAprovadoMedia() {
   return aprovadoMedia;
 }
 
  public void setAprovadoMedia(boolean aprovadoMedia) {
    this.aprovadoMedia = aprovadoMedia;
  }
  
  
  public String getNomeDaMae() {
    return nomeDaMae;
  }
  
  public void setNomeDaMae(String nomeDaMae) {
    this.nomeDaMae = nomeDaMae;
  }
  
  public LocalDate getDataCadastro() {
    return dataCadastro;
  }
  
  public LocalDate getDataNascimento() {
    return dataNascimento;
  }
  
  
  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public void setDataCadastro(LocalDate dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nomeDaMae="
        + nomeDaMae + ", aprovadoMedia=" + aprovadoMedia + ", dataNascimento=" + dataNascimento + ", dataCadastro="
        + dataCadastro + "]";
  }
}