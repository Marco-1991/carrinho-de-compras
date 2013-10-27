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
    
    @Test(expected = NomeVazioTest.class)
    public void isNull() throws NomeVazioTest{
        
      Produto produto = new Produto("", 10.00);  
      String nome;
      nome = produto.getNome();
        
      Assert.assertEquals(nome, "");
    }
    
    @Test(expected = PrecoNegativoTest.class)
    public void isNegative() throws PrecoNegativoTest{
        
      Produto produto = new Produto("Test", -10);  
      double preco;
      preco = produto.getPreco();
      
    
      Assert.assertTrue(preco < 0);
    }
    
    
    @Test(expected = AdicionarProdutoTest.class)
    public void addProduct() throws AdicionarProdutoTest{
        
        //Carrinho carrinho = new Carrinho(); 
        Produto produto = new Produto("", 10.00);  
        Carro carro = new Carro();
        
        Assert.assertSame(produto, carro);
    }
}