package br.uem.din.medicalclinic.bean;

import br.uem.din.medicalclinic.controller.SecretaryController;
import br.uem.din.medicalclinic.model.Secretary;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "secretaryBean")
@SessionScoped
public class SecretaryBean implements Serializable, Cadastrable<Secretary> {

    private Secretary secretary;
    
    public SecretaryBean() {
        secretary = new Secretary();
    }        
   
    public Secretary getSecretary() {
        return secretary;
    }
    
    @Override
    public String add() {
        SecretaryController.getInstance().add(secretary);
        return "index";
    }
    
    @Override
    public List<Secretary> listAll() {
        return SecretaryController.getInstance().getList();
    }
    
    @Override
    public String create() {
        secretary = new Secretary();
        return "create";
    }
    
    @Override
    public String index() {
        return "index";
    }
    
    @Override
    public String edit(Secretary object) {
        secretary = object;
        return "edit";
    }
    
    @Override
    public String edit() {
        
        return "index";
    }
    
    @Override
    public String delete(Secretary object) {
        SecretaryController.getInstance().delete(object);
        return "index";
    }
    
    @Override
    public String details(Secretary object) {
        secretary = object;
        return "details";
    }
    
}
