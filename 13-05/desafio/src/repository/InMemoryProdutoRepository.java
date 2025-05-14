package repository;

import domain.Produto;

import java.util.*;

public class InMemoryProdutoRepository {
    private final Map<String, Produto> storage = new HashMap<>();

    public void save(Produto produto) {
        storage.put(Produto.getCodigo(), produto)
    }
}
