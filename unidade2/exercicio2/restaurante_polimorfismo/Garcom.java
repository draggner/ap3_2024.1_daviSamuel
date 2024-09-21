package restaurante_polimorfismo;

public class Garcom extends Funcionario {
    
  private double valorGorjeta;

  public Garcom(String nome, String cargo, double valorGorjeta) {
    super(nome, cargo);
    this.valorGorjeta = valorGorjeta;
  }

  public double getValorGorjeta() {
    return valorGorjeta;
  }
  
  public void setValorGorjeta(double valorGorjeta) {
    this.valorGorjeta = valorGorjeta;
  }
  
  public void trabalhar() {
    System.out.println("Garsom = serve o cliente.");
  }
  
  @Override
  public String toString() {
    return "Garsom [valorGorjeta=" + valorGorjeta + "]";
  }
}