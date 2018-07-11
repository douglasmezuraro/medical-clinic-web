package br.uem.din.medicalclinic.bean.patient;

import br.uem.din.medicalclinic.controller.PatientsController;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "patientsDelete")
@SessionScoped
public class Delete implements Serializable {

    public Delete() {
        
    }

    public String delete(Patient model) {
        return PatientsController.getInstance().delete(model);
    }

}
