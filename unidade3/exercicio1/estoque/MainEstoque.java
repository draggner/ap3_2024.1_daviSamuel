public class MainEstoque {
  public static void main(String[] args) {
    ControleEstoque controleEstoque = new ControleEstoque();

    Produto produto1 = new Produto("789588", "Monitor Javac", 6);
    Produto produto2 = new Produto("777777", "Mouse Javac", 30);
    Produto produto3 = new Produto("657438", "Placa Mãe Javac", 8);
    try {
      System.out.println("Adicionando Produto...");
      
      controleEstoque.adicionar(produto1);
      controleEstoque.adicionar(produto2);
      controleEstoque.adicionar(produto3);
      
      System.out.println("3 produtos adicionados.");

      controleEstoque.remover("6");

    } catch (ProdutoNaoEncontradoException e) {
      System.out.println(e.getMessage());
    }
  }
}