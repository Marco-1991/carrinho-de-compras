package br.calebe.exemplos.ex02;

import br.calebe.exemplos.ex02.controller.StatusController;

public class Status {
    
    private StatusController controller;
    private String status;
    
    Status() throws Exception {
        controller = new StatusController();
    }
    
    public void run(String statusType) {
        status = controller.consultStatus(statusType);
    }
    
    public String getStatus() {
        return status;
    }
}
