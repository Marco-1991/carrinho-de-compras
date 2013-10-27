package br.calebe.exemplos.ex02.controller;

import br.calebe.exemplos.ex02.CartaoCreditoInterface;
import java.io.FileInputStream;
import java.util.Properties;
import javax.naming.InitialContext;

public class CartaoCreditoController implements CartaoCreditoInterface {
 
    private CartaoCreditoInterface cartao;
    
    public CartaoCreditoController() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        cartao = (CartaoCreditoInterface) ctx.lookup("ejb/EJBStatelessExemplo");
    }
    
    @Override
    public String checkNumeroCartao(String numeroCartaoTested) {
        
        return cartao.checkNumeroCartao(numeroCartaoTested);
    }
    
    @Override
    public String checkCodigoSeguranca(int codigoSegurancaTested) {
        
        return cartao.checkCodigoSeguranca(codigoSegurancaTested);
    }
    
    @Override
    public String checkLimite(float limiteTested) {
        
        return cartao.checkLimite(limiteTested);
    }
}