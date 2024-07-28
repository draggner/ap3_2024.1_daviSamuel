//Fully Qualified Name;
package unidade1.gabarito_aula2.br.com.davi.aula2;

// Ia explicar alguma coisa porém não explicou.

public class TiposPrimitivos {
  public static void main(String[] args) {
    System.err.println(" ");
    System.out.println("Declarando Tipos Primitivos em Java");
    System.out.println("-----------------------------------");
    /*
      1. Crie um programa que declare variáveis de todos os tipos:a
        - byte
        - short
        - int
        - long
        - float
        - double
        - boolean
        - char
        - String
        Logo, atribua valores a todos e imprima esses valores no console.
    */

    byte codigoByte = 112;
    System.out.println("Tipo byte: " + codigoByte);
    // Valores entre -128 e 127 para tipo byte.
    
    short codigoShort = 32767;
    System.err.println("Tipo short: " + codigoShort);
    // Valores entre -32.768 e 32.767 para tipo short.

    int codigoInt = 20;
    System.err.println("Tipo int: " + codigoInt);
    // Valores entre -2.147.483.648 a 2.147.483.647 para tipo int.

    long codigoLong = 23L;
    System.out.println("Tipo long: " + codigoLong);
    // Valores entre -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 para tipo long.

    float codigoFloat = 220;
    System.out.println("Tipo float: " + codigoFloat);
    // Valores entre -3.40292347E+38 a +3.40292347E+38 para tipo float.

    double codigoDouble = 22.0;
    System.out.println("Tipo double: " + codigoDouble);
    // Valores entre -1.79769313486231570E+308 a +1.79769313486231570E+308 para tipo double.

    boolean codigoBoolean = true;
    System.err.println("Tipo boolean: " + codigoBoolean);
    // Somente dois valores: true ou false.

    char codigoChar = 255;
    System.err.println("Tipo char: " + codigoChar);
    // Valores entre 0 e 255 ou um valor com sinal (char) entre –128 a 127.

    String codigoString = "Davi Samuel";
    System.out.println("Tipo String: " + codigoString);
    // Aceita valores númericos, caracteres especiais, etc?
  }
}
