public class ProdutoNaoEncontradoException extends Exception {
  public ProdutoNaoEncontradoException(String message) {
    super("Produto [INDEFINIDO]: " + message);
  }
}