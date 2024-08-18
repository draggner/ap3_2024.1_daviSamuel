package unidade1.exercicio1;

/**
 * Class Latao
 * 
 * - Este programa serve para indicar a quantidade de cada componente de Zinco e Cobre para informar a quantidade de quilos de latão, conforme o valor inserido pelo usuário.
 * 
 * @author Davi Samuel G. A.
 * @version 1.0
 * @since 2024-08-17
 * 
 * COD: 695686780
*/

public class Latao {
  float valor = 0F;
  float cobre = 0.7F;
  float zinco = 0.3F;
  
  public float getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public float getCobre() {
    return cobre;
  }

  public void setCobre(float cobre) {
    this.cobre = cobre;
  }

  public float getZinco() {
    return zinco;
  }

  public void setZinco(float zinco) {
    this.zinco = zinco;
  }

  public float converterZinco(float quiloValor, float valorZinco) {
    float zn = quiloValor * valorZinco;
    return zn;
  }

  public float converterCobre(float quiloValor, float valorCobre) {
    float cu = quiloValor * valorCobre;
    return cu;
  }

  @Override
  public String toString() {
    return "Latao [cobre=" + cobre + ", zinco=" + zinco + "]";
  }
}
