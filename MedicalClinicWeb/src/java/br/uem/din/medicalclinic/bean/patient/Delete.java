package br.uem.din.medicalclinic.bean.patient;

import br.uem.din.medicalclinic.controller.PatientsController;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;

@Named(value = "patientsDelete")
@RequestScoped
public class Delete implements Serializable {

    public Delete() {
        
    }

    public String delete(Patient model) {
        return PatientsController.getInstance().delete(model);
    }

}
