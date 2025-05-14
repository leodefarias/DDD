package services;

public interface ProdutoInterface {
    void cadastrarProduto(String nome, int preco, Integer codigo);
    void alterarPreco(Integer codigo);
}
