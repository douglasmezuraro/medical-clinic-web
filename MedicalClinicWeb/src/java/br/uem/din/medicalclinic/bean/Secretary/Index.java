package br.uem.din.medicalclinic.bean.Secretary;

import br.uem.din.medicalclinic.controller.SecretariesController;
import br.uem.din.medicalclinic.model.Secretary;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "secretaries.index")
@SessionScoped
public class Index implements Serializable {
    
    public List<Secretary> listAll() {
        return SecretariesController.getInstance().listAll();
    }
    
}
