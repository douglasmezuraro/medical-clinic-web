package br.uem.din.medicalclinic.bean.Secretary;

import br.uem.din.medicalclinic.controller.SecretariesController;
import br.uem.din.medicalclinic.model.Secretary;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "secretaries.create")
@SessionScoped
public class Create implements Serializable {

    public Secretary getModel() {
        return SecretariesController.getInstance().getModel();
    }
    
    public String create() {
        return SecretariesController.getInstance().create();
    }
    
    public String create(Secretary model) {
        return SecretariesController.getInstance().create(model);
    }
       
}
