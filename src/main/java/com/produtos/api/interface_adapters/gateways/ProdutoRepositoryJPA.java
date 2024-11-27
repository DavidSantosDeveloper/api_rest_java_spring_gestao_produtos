package com.produtos.api.interface_adapters.gateways;

import java.util.List;
import java.util.Optional;

import com.produtos.api.Aplicattion.abstration_gateway.ProdutoGateway;
import com.produtos.api.entities.Produto;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepositoryJPA implements ProdutoGateway {

    private final ProdutoJpaRepository jpaRepository;

    public ProdutoRepositoryJPA(ProdutoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Produto salvar(Produto produto) {
        ProdutoEntity entity = ProdutoEntity.fromDomain(produto);
        return jpaRepository.save(entity).toDomain();
    }

    @Override
    public List<Produto> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(ProdutoEntity::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Produto> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(ProdutoEntity::toDomain);
    }

    @Override
    public void deletar(Long id) {
        jpaRepository.deleteById(id);
    }
}