package repository.impl;

import domain.Produto;
import repository.ProdutoRepository;

public class ProdutoServiceImpl {
    private final ProdutoRepository repository;

    public ProdutoServiceImpl(ProdutoRepository  repository) {
        this.repository;
    }

    public void registrarProduto(String nome, int preco, Integer codigo) {
        Produto produto = new Produto(nome, preco, codigo);
    }

    public void alterarPreco(Integer codigo, int preco) {
        Produto produto = repository.findByCodigo(codigo);
        Produto.setPreco(preco);
        repository.
    }
}
