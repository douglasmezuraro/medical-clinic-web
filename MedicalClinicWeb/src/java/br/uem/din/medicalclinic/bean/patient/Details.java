package br.uem.din.medicalclinic.bean.patient;

import br.uem.din.medicalclinic.controller.PatientsController;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "patients.details")
@SessionScoped
public class Details implements Serializable {
    
    public Patient getModel() {
        return PatientsController.getInstance().getModel();
    }
    
    public String details(Patient model) {
        return PatientsController.getInstance().details(model);
    }
}
