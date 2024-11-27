package com.produtos.api.interface_adapters.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.produtos.api.entities.Produto;
import com.produtos.api.Aplicattion.use_cases.implementation.GerenciarProdutos;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final GerenciarProdutos gerenciarProdutos;

    public ProdutoController(GerenciarProdutos gerenciarProdutos) {
        this.gerenciarProdutos = gerenciarProdutos;
    }

    @PostMapping
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok(gerenciarProdutos.criarProduto(produto));
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        return ResponseEntity.ok(gerenciarProdutos.listarProdutos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return gerenciarProdutos.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return ResponseEntity.ok(gerenciarProdutos.atualizarProduto(id, produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {
        gerenciarProdutos.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }
}