package br.calebe.exemplos.ex02.controller;

import br.calebe.exemplos.ex02.ConsultStatusInterface;
import java.io.FileInputStream;
import java.util.Properties;
import javax.naming.InitialContext;

public class StatusController implements ConsultStatusInterface {
    
    private ConsultStatusInterface status;
    
    public StatusController() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        status = (ConsultStatusInterface) ctx.lookup("ejb/EJBStatelessExemplo");
    }
    
    @Override
    public String consultStatus(String statusType){
        
        return status.consultStatus(statusType);
    }
}
