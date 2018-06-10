package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.Secretary;

public class SecretaryController extends BaseController<Secretary> {
    
    private static SecretaryController instance;
    
    public static SecretaryController getInstance() {
        if(instance == null)
            instance = new SecretaryController();
        return instance;
    }
    
    
}