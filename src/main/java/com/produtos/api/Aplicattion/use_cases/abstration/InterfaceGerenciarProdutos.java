
package com.produtos.api.Aplicattion.use_cases.abstration;

import java.util.List;
import java.util.Optional;

import com.produtos.api.entities.Produto;

public interface InterfaceGerenciarProdutos {


    public Produto criarProduto(Produto produto);

    public List<Produto> listarProdutos();

    public Optional<Produto> buscarPorId(Long id);

    public Produto atualizarProduto(Long id, Produto produtoAtualizado);

    public void deletarProduto(Long id);
}
