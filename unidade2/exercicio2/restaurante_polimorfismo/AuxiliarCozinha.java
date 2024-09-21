package restaurante_polimorfismo;
public class AuxiliarCozinha extends Funcionario {
  
  private String turno;

  public AuxiliarCozinha(String nome, String cargo, String turno) {
    super(nome, cargo);
    this.turno = turno;
  }
    
  public void trabalhar() {
    System.out.println("Auxiliar de Cozinha: prepara a comida para o cliente.");
  }

  public String getTurno() {
    return turno;
  }

  public void setTurno(String turno) {
    this.turno = turno;
  }

  @Override
  public String toString() {
    return "AuxiliarCozinha [turno=" + turno + "]";
  }
}