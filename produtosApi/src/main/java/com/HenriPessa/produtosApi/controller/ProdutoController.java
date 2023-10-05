package com.HenriPessa.produtosApi.controller;

import com.HenriPessa.produtosApi.model.Produto;
import com.HenriPessa.produtosApi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.getById(id));
    }
    @PostMapping
    public ResponseEntity<Produto> save(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.save(produto));
    }
    @PutMapping
    public ResponseEntity<Produto> replace(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.replace(produto));
    }
    @DeleteMapping
    public ResponseEntity<String> delete(long id) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(produtoService.delete(id));
    }

}
