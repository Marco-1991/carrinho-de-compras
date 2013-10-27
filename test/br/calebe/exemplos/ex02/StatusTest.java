package br.calebe.exemplos.ex02;

import br.calebe.exemplos.ex02.controller.StatusController;
import junit.framework.Assert;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Status.class})
public class StatusTest {
    
    @Test
    public void executandoStatusAguardandoPagamento() throws Exception {
        
        StatusController controllerMock = PowerMock.createMock(StatusController.class);
        PowerMock.expectNew(StatusController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultStatus("aguardandoPagamento")).andReturn("aguardandoPagamento");
        PowerMock.replay(controllerMock, StatusController.class);
        
        Status tested = new Status();
        tested.run("aguardandoPagamento");
        Assert.assertEquals("aguardandoPagamento", tested.getStatus());
        
        PowerMock.verifyAll();
    }
    
    @Test
    public void executandoStatusPago() throws Exception {
        
        StatusController controllerMock = PowerMock.createMock(StatusController.class);
        PowerMock.expectNew(StatusController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultStatus("pago")).andReturn("pago");
        PowerMock.replay(controllerMock, StatusController.class);
        
        Status tested = new Status();
        tested.run("pago");
        Assert.assertEquals("pago", tested.getStatus());
        
        PowerMock.verifyAll();
    }
     
    @Test
    public void executandoStatusEmpacotando() throws Exception {
        
        StatusController controllerMock = PowerMock.createMock(StatusController.class);
        PowerMock.expectNew(StatusController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultStatus("empacotando")).andReturn("empacotando");
        PowerMock.replay(controllerMock, StatusController.class);
        
        Status tested = new Status();
        tested.run("empacotando");
        Assert.assertEquals("empacotando", tested.getStatus());
        
        PowerMock.verifyAll();
    }
    
    @Test
    public void executandoStatusEnviadoEntrega() throws Exception {
        
        StatusController controllerMock = PowerMock.createMock(StatusController.class);
        PowerMock.expectNew(StatusController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultStatus("enviadoEntrega")).andReturn("enviadoEntrega");
        PowerMock.replay(controllerMock, StatusController.class);
        
        Status tested = new Status();
        tested.run("enviadoEntrega");
        Assert.assertEquals("enviadoEntrega", tested.getStatus());
        
        PowerMock.verifyAll();
    }
    
    @Test
    public void executandoStatusEntregue() throws Exception {
        
        StatusController controllerMock = PowerMock.createMock(StatusController.class);
        PowerMock.expectNew(StatusController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultStatus("entregue")).andReturn("entregue");
        PowerMock.replay(controllerMock, StatusController.class);
        
        Status tested = new Status();
        tested.run("entregue");
        Assert.assertEquals("entregue", tested.getStatus());
        
        PowerMock.verifyAll();
    }
}
