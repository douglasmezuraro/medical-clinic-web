package br.uem.din.medicalclinic.bean.Secretary;

import br.uem.din.medicalclinic.controller.SecretariesController;
import br.uem.din.medicalclinic.model.Secretary;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "secretaries.details")
@SessionScoped
public class Details implements Serializable {
    
    public Secretary getModel() {
        return SecretariesController.getInstance().getModel();
    }
    
    public String details(Secretary model) {
        return SecretariesController.getInstance().details(model);
    }
}
