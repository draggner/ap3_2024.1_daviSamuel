package restaurante_heranca;

public class Garsom extends Funcionario {

  private double valorGorjeta;
  
  public Garsom(String nome, String cargo, double valorGorjeta) {
    super(nome, cargo);
    this.valorGorjeta = valorGorjeta;
  }
   
  public double getValorGorjeta() {
    return valorGorjeta;
  }
  
  public void setValorGorjeta(double valorGorjeta) {
    this.valorGorjeta = valorGorjeta;
  }
  
  @Override
  public String toString() {
    return "Garsom [valorGorjeta=" + valorGorjeta + ", toString()=" + super.toString() + "]";
  }
}