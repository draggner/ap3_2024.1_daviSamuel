package unidade1.exercicio1;

/**
 * Class Contato
 * 
 * - Este programa é responsável por modelar as instâncias de contato dos respectivos usuários de pintores renascentistas.
 * 
 * @author Davi Samuel G. A.
 * @version 1.0
 * @since 2024-08-17
 * 
 * COD: 695686780
*/

public class Contato {

  String nome = "semNome";
  String telefone = "semTelefone";
  
  public Contato(String nomeUser, String telefoneUser) {
    this.nome = nomeUser;
    this.telefone = telefoneUser;
  }
  
  public String getNome() {
    return nome.toUpperCase();
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  @Override
  public String toString() {
    return "Contato [nome=" + nome.toUpperCase() + ", telefone=" + telefone + "]";
  }
}
