package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.Secretary;
import java.util.ArrayList;
import java.util.List;

public class CrudController {
    
    private List<Secretary> secretaries;
    
    private static CrudController instance;
    
    private CrudController() {
        secretaries = new ArrayList<>();
    }
    
    public static CrudController getInstance() {
        if(instance == null)
            instance = new CrudController();
        return instance;
    }
    
    public void addSecretary(Secretary object) {
        secretaries.add(object);
    }
    
    public List<Secretary> listSecretaries() {
        return secretaries;
    }
    
}
