package br.calebe.exemplos.ex01;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {
    
    @Test
    public void saoDiferentes(){
        
        Produto produtoA = new Produto("Fazendo Testes ", 10.00);
        Produto produtoB = new Produto("Fazendo ", 12.00);
        
        boolean resposta = produtoA.equals(produtoB);
        
        Assert.assertFalse(resposta);
    }
    
    @Test
    public void saoIguais(){
        
        Produto produtoA = new Produto("Fazendo Testes ", 10.00);
        Produto produtoB = new Produto("Fazendo Testes ", 10.00);
        
        boolean resposta = produtoA.equals(produtoB);
        
        Assert.assertTrue(resposta);
    }
    
    @Test
    public void isNull(){
        
        Produto produto = new Produto("",1);
        
        boolean resposta = produto.equals(null);
        
        Assert.assertFalse(resposta);
    }
}


