import restaurante_heranca.Funcionario;
import restaurante_heranca.Garsom;

public class MainRestaurante {
  public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario("Davi Samuel", "Desenvolvedor Sênior Back-end Java");
    Garsom garsom1 = new Garsom("João Gabriel", "Garsom", 8000);

    System.out.println(funcionario1);
    System.out.println(garsom1);
  }
}