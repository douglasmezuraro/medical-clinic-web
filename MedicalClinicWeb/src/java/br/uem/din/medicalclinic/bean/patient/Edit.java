package br.uem.din.medicalclinic.bean.patient;

import br.uem.din.medicalclinic.controller.PatientsController;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "patients.edit")
@SessionScoped
public class Edit implements Serializable {

    public Patient getModel() {
        return PatientsController.getInstance().getModel();
    }
       
    public String edit() {
        return PatientsController.getInstance().edit();
    }
    
    public String edit(Patient model) {
        return PatientsController.getInstance().edit(model);
    }
    
}
