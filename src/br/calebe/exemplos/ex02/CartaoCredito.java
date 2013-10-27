package br.calebe.exemplos.ex02;

import br.calebe.exemplos.ex02.controller.CartaoCreditoController;

public class CartaoCredito {
    
    private CartaoCreditoController controller;
    String numeroCartao;
    String codigoSeguranca;
    String limite;
  
    CartaoCredito() throws Exception {
        controller = new CartaoCreditoController();
    }

    public void run(String numeroCartaoTested) {
        numeroCartao = controller.checkNumeroCartao(numeroCartaoTested);
    }
    
    public void run(int codigoSegurancaTested) {
        codigoSeguranca = controller.checkCodigoSeguranca(codigoSegurancaTested);
    }
    
    public void run(float limiteTested) {
        limite = controller.checkLimite(limiteTested);
    }
    
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public String getLimite() {
        return limite;
    }
}
