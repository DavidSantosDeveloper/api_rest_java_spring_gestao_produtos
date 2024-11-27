
package com.produtos.api.Aplicattion.abstration_gateway;

import java.util.List;
import java.util.Optional;

import com.produtos.api.entities.Produto;

public interface ProdutoGateway  {
    Produto salvar(Produto produto);
    List<Produto> listarTodos();
    Optional<Produto> buscarPorId(Long id);
    void deletar(Long id);
}
