import restaurante_heranca.Funcionario;
import restaurante_heranca.Garsom;

public class MainRestaurante {
  public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario("Davi Samuel", "Desenvovledor Front-end Web");
    Garsom garsom1 = new Garsom("João Gabriel", "Desenvolvedor Sênior", 8000);

    System.out.println(funcionario1);
    System.out.println(garsom1);
  }
}