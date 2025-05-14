package repository;

import domain.Produto;

public interface ProdutoRepository {
    void registrarProduto(Produto produto);
    Produto findByCodigo(Integer codigo);
}
