package restaurante_polimorfismo;
public class Barman extends Funcionario {
  
  private String especialidade;
  
  public Barman(String nome, String cargo, String especialidade) {
    super(nome, cargo);
    this.especialidade = especialidade;
  }
  
  public String getEspecialidade() {
    return especialidade;
  }
  
  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public void trabalhar() {
    System.out.println("\n Barman = chacoalhar bebida para o cliente.");
  }

  @Override
  public String toString() {
    return "Barman [especialidade=" + especialidade + "]";
  }
} 