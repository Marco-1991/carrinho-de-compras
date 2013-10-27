package br.calebe.exemplos.ex02;

import javax.ejb.Remote;

@Remote
public interface ConsultStatusInterface {
    
    String consultStatus(String statusType);
}
