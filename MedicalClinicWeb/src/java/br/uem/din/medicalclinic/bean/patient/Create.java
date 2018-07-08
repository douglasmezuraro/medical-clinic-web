package br.uem.din.medicalclinic.bean.patient;

import br.uem.din.medicalclinic.controller.PatientsController;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "patients.create")
@SessionScoped
public class Create implements Serializable {

    public Patient getModel() {
        return PatientsController.getInstance().getModel();
    }
    
    public String create() {
        return PatientsController.getInstance().create();
    }
    
    public String create(Patient model) {
        return PatientsController.getInstance().create(model);
    }
       
}
