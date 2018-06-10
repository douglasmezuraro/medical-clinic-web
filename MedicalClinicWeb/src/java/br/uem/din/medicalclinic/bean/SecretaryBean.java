package br.uem.din.medicalclinic.bean;

import br.uem.din.medicalclinic.controller.SecretaryController;
import br.uem.din.medicalclinic.model.Secretary;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "secretaryBean")
@SessionScoped
public class SecretaryBean extends BaseBean implements Serializable  {

    private Secretary secretary;
    
    public SecretaryBean() {
        secretary = new Secretary();
    }        
   
    public Secretary getSecretary() {
        return secretary;
    }
    
    public String add() {
        SecretaryController.getInstance().add(secretary);
        return "index";
    }
    
    public List<Secretary> listAll() {
        return SecretaryController.getInstance().getList();
    }
    
    public String create() {
        secretary = new Secretary();
        return "create";
    }
    
    public String index() {
        return "Secretary/index";
    }
    
    public String edit(Secretary o) {
        secretary = o;
        return "create";
    }
    
    public String delete(Secretary o) {
        SecretaryController.getInstance().delete(o);
        return "index";
    }
}
