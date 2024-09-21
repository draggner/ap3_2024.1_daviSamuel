package restaurante_polimorfismo;
public abstract class Funcionario {
  private String nome;
  private String cargo;
  
  public Funcionario(String nome, String cargo) {
    this.nome = nome;
    this.cargo = cargo;
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public abstract void trabalhar();
  
  @Override
  public String toString() {
    return "Funcionario [nome=" + nome + ", cargo=" + cargo + "]";
  }
}