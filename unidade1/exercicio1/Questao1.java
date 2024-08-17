package unidade1.exercicio1;

public class Questao1 {

  double x1 = 1.0;  
  double y1 = 1.0;
  double x2 = 1.0;
  double y2 = 1.0;
  double distancia = 1.0;
  
  double valor1 = 0.0;
  double valor2 = 0.0;
  double amplitude = 0.0;

  public double getX1() {
    return x1;
  }

  public void setX1(double x1) {
    this.x1 = x1;
  }
  
  public double getY1() {
    return y1;
  }

  public void setY1(double y1) {
    this.y1 = y1;
  }

  public double getX2() {
    return x2;
  }

  public void setX2(double x2) {
    this.x2 = x2;
  }

  public double getY2() {
    return y2;
  }

  public void setY2(double y2) {
    this.y2 = y2;
  }
  
  public double getDistancia() {
    return distancia;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }

  public double getValor1() {
    return valor1;
  }

  public void setValor1(double valor1) {
    this.valor1 = valor1;
  }

  public double getValor2() {
    return valor2;
  }

  public void setValor2(double valor2) {
    this.valor2 = valor2;
  }

  public double getAmplitude(double valor1, double valor2) {
    amplitude = valor1 - valor2;
    return amplitude;
  }

  public void setAmplitude(double amplitude) {
    this.amplitude = amplitude;
  }

  @Override
  public String toString() {
    return "Questao1 [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", distancia=" + distancia + ", valor1="
        + valor1 + ", valor2=" + valor2 + ", amplitude=" + amplitude + "]";
  }
}
