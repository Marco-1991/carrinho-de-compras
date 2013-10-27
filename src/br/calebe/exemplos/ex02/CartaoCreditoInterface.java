package br.calebe.exemplos.ex02;

import javax.ejb.Remote;

@Remote
public interface CartaoCreditoInterface {
    
    String checkNumeroCartao(String numeroCartaoTested);
    String checkCodigoSeguranca(int codigoSegurancaTested);
    String checkLimite(float limiteTested);
}
