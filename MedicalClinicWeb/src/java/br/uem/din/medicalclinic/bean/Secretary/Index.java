package br.uem.din.medicalclinic.bean.Secretary;

import br.uem.din.medicalclinic.controller.SecretariesController;
import br.uem.din.medicalclinic.model.Secretary;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "secretariesIndex")
@SessionScoped
public class Index implements Serializable {
    
    public Index() {
        
    }

    public String edit(Secretary model) {
        return SecretariesController.getInstance().edit(model);
    }

    public String delete(Secretary model) {
        return SecretariesController.getInstance().delete(model);
    }
    
    public String details(Secretary model) {
        return SecretariesController.getInstance().details(model);
    }
    
    public String create() {
        return SecretariesController.getInstance().create();
    }    

    public List<Secretary> listAll() {
        return SecretariesController.getInstance().listAll();
    }
    
}
