
package br.calebe.exemplos.ex02;

import br.calebe.exemplos.ex02.controller.CartaoCreditoController;
import junit.framework.Assert;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({CartaoCredito.class})
public class CartaoCreditoTest {
    
    @Test
    public void executandoCheckNumeroCartao() throws Exception {
        
        CartaoCreditoController controllerMock = PowerMock.createMock(CartaoCreditoController.class);
        PowerMock.expectNew(CartaoCreditoController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.checkNumeroCartao("4073020000000002")).andReturn("valid");
        PowerMock.replay(controllerMock, CartaoCreditoController.class);
        
        CartaoCredito tested = new CartaoCredito();
        tested.run("4073020000000002");
        Assert.assertEquals("valid", tested.getNumeroCartao());
        
        PowerMock.verifyAll();
    }
    
    @Test
    public void executandoCheckCodigoSeguranca() throws Exception {
        
        CartaoCreditoController controllerMock = PowerMock.createMock(CartaoCreditoController.class);
        PowerMock.expectNew(CartaoCreditoController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.checkCodigoSeguranca(891)).andReturn("valid");
        PowerMock.replay(controllerMock, CartaoCreditoController.class);
        
        CartaoCredito tested = new CartaoCredito();
        tested.run(891);
        Assert.assertEquals("valid", tested.getCodigoSeguranca());
        
        PowerMock.verifyAll();
    }
    
    @Test
    public void executandoCheckLimite() throws Exception {
        
        CartaoCreditoController controllerMock = PowerMock.createMock(CartaoCreditoController.class);
        PowerMock.expectNew(CartaoCreditoController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.checkLimite(2499.90f)).andReturn("valid");
        PowerMock.replay(controllerMock, CartaoCreditoController.class);
        
        CartaoCredito tested = new CartaoCredito();
        tested.run(2499.90f);
        Assert.assertEquals("valid", tested.getLimite());
        
        PowerMock.verifyAll();
    }
}
