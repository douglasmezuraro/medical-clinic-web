package br.uem.din.medicalclinic.bean.Secretary;

import br.uem.din.medicalclinic.controller.SecretariesController;
import br.uem.din.medicalclinic.model.Secretary;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "secretaries.edit")
@SessionScoped
public class Edit implements Serializable {

    public Secretary getModel() {
        return SecretariesController.getInstance().getModel();
    }
       
    public String edit() {
        return SecretariesController.getInstance().edit();
    }
    
    public String edit(Secretary model) {
        return SecretariesController.getInstance().edit(model);
    }
    
}
