package com.HenriPessa.produtosApi.service;

import com.HenriPessa.produtosApi.model.Produto;
import com.HenriPessa.produtosApi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }
    public Produto getById(long id){
        for (Produto produto:produtoRepository.findAll()){
            if (produto.getId()==id){
                return produto;
            }
        }
        return null;
    }
    public Produto save(Produto produto){
        for (Produto produtoNaLista: produtoRepository.findAll()){
            if (produto.getId()!=produtoNaLista.getId()){
                produtoRepository.findAll().add(produto);
            }
        }
        return null;
    }
    public Produto replace(Produto produto){
        for (Produto produtoNaLista: produtoRepository.findAll()){
            if (produto.getId()==produtoNaLista.getId()){
                produtoRepository.delete(produtoNaLista);
                produtoRepository.findAll().add(produto);
            }
        }
        return null;
    }

    public String delete(long id){
        for (Produto produto:produtoRepository.findAll()){
            if (produto.getId()==id){
                 produtoRepository.delete(produto);
            }
        }
     return null;
    }

}
