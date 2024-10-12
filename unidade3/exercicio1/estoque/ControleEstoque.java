import java.util.Arrays;

public class ControleEstoque {
  private int capacidade = 30;
  private Produto[] osProdutos = new Produto[capacidade];

  private int contador = 0;

  public ControleEstoque() {
    //Vazio
  }

  public void adicionar(Produto produto) {
    if (contador < capacidade) {
      osProdutos[contador] = produto;
      contador++;
      System.out.println("\nProduto Adicionado: \nNome: " + produto.getNome());
    } else {
      System.out.println("Capacidade de Insersão de Produtos Atingidas...");
    }
  }

  public void remover(String codigo) throws ProdutoNaoEncontradoException {
    for (int i = 0; i < contador; i++) {
      if (osProdutos[i].getCodigo().equals(codigo)) {
        osProdutos[i] = osProdutos[contador - 1];
        osProdutos[contador - 1] = null;
        contador--;
        System.out.println("Produto Removido: " + codigo);
        return;
      }
    }
    throw new ProdutoNaoEncontradoException(codigo);
  }

  public int getCapacidade() {
    return capacidade;
  }
  
  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public Produto[] getOsProdutos() {
    return osProdutos;
  }
  
  public void setOsProdutos(Produto[] osProdutos) {
    this.osProdutos = osProdutos;
  }

  @Override
  public String toString() {
    return "ControleEstoque [capacidade=" + capacidade + ", osProdutos=" + Arrays.toString(osProdutos) + "]";
  }
}