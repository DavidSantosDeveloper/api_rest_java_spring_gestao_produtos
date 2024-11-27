package com.produtos.api.Aplicattion.use_cases.implementation;

import java.util.List;
import java.util.Optional;

import com.produtos.api.interface_adapters.gateways.ProdutoGateway;
import com.produtos.api.Aplicattion.use_cases.abstration.InterfaceGerenciarProdutos;
import com.produtos.api.entities.Produto;




public class GerenciarProdutos  implements InterfaceGerenciarProdutos {

    private final ProdutoGateway repository;

    public GerenciarProdutos(ProdutoGateway repository) {
        this.repository = repository;
    }

    public Produto criarProduto(Produto produto) {
        return repository.salvar(produto);
    }

    public List<Produto> listarProdutos() {
        return repository.listarTodos();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return repository.buscarPorId(id);
    }

    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        return repository.buscarPorId(id).map(produto -> {
            Produto atualizado = new Produto(
                produto.getId(),
                produtoAtualizado.getNome(),
                produtoAtualizado.getDescricao(),
                produtoAtualizado.getCategoria(),
                produtoAtualizado.getQuantidade(),
                produtoAtualizado.getPrecoUnitario()
            );
            return repository.salvar(atualizado);
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public void deletarProduto(Long id) {
        repository.deletar(id);
    }
}
