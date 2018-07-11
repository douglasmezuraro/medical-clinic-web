package br.uem.din.medicalclinic.bean.Secretary;

import br.uem.din.medicalclinic.controller.SecretariesController;
import br.uem.din.medicalclinic.model.Secretary;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "secretariesDelete")
@SessionScoped
public class Delete implements Serializable {

    public Delete() {
        
    }

    public String delete(Secretary model) {
        return SecretariesController.getInstance().delete(model);
    }

}
