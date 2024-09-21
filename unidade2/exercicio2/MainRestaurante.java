import restaurante_heranca.Garsom;
import restaurante_polimorfismo.AuxiliarCozinha;
import restaurante_polimorfismo.Barman;
import restaurante_polimorfismo.Funcionario;
import restaurante_polimorfismo.Garcom;
import restaurante_polimorfismo.TRABALHA_NUMA;

public class MainRestaurante {
  public static void main(String[] args) {
    //comPolimorfismo();
    semPolimorfismo();
  }

  public static void semPolimorfismo() {
    System.out.println("\n");
    System.out.println("Implementação sem Polimorfismo");

    Garcom umGarcomUm = new Garcom("Davi Samuel", "Programas em Categoria II", 1500);
    AuxiliarCozinha umAuxiliarCozinhaUm = new AuxiliarCozinha("Gabriel", "Programas em III", "Noturno",
        TRABALHA_NUMA.LIMPEZA);

    Barman umBarmanUm = new Barman("João Gabriel", "Programas em IV", "Júnior");

    umAuxiliarCozinhaUm.trabalhar();
    umBarmanUm.trabalhar();
    umGarcomUm.trabalhar();
  }

  public static void comPolimorfismo() {
    System.out.println("\n");
    System.out.println("Implementação com Polimorfismo");

    Funcionario umGarcom = new Garcom("João Gabriel", "Garconete de Programa", 1600);
    umGarcom.trabalhar();

    Funcionario umAuxiliar = new AuxiliarCozinha("Lucas Araújo", "Cozinheira de Programa", "Integral",
        TRABALHA_NUMA.SOBREMESA);
    
    umAuxiliar.trabalhar();

    Funcionario umBarman = new Barman("Bénicio", "Barman de Programas", "Chacoalhar Programas");

    umBarman.trabalhar();

    /*
     * Funcionario umFuncionario = new Funcionario("Davi Samuel",
     * "Desenvolvedor Front-end na Turing Tecnologia");
     * umFuncionario.trabalhar();
     * 
     * OBS: Não realiza a operação do método, tendo em vista que é a classe mãe
     * define o método trabalhar como abstrato, para outras classes definir
     * propriamente.
     */

  }
}