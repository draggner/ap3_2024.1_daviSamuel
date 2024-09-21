package restaurante_polimorfismo;

public class AuxiliarCozinha extends Funcionario {
  
  private String turno;
  public TRABALHA_NUMA trabalha_numa;
  
  public AuxiliarCozinha(String nome, String cargo, String turno, TRABALHA_NUMA trabalha_numa) {
    super(nome, cargo);
    this.turno = turno;
    this.trabalha_numa = trabalha_numa;
  }

  public String getTurno() {
    return turno;
  }

  public void setTurno(String turno) {
    this.turno = turno;
  }

  public TRABALHA_NUMA getTrabalha_numa() {
    return trabalha_numa;
  }

  public void setTrabalha_numa(TRABALHA_NUMA trabalha_numa) {
    this.trabalha_numa = trabalha_numa;
  }
  
  public void trabalhar() {
    System.out.println("Auxiliar de Cozinha: prepara a comida para o cliente.");
  }

  @Override
  public String toString() {
    return "AuxiliarCozinha [turno=" + turno + ", trabalha_numa=" + trabalha_numa + "]";
  }
}