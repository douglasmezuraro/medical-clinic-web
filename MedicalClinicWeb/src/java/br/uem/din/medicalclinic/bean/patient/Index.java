package br.uem.din.medicalclinic.bean.patient;

import br.uem.din.medicalclinic.controller.PatientsController;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "patients.index")
@SessionScoped
public class Index implements Serializable {
    
    public List<Patient> listAll() {
        return PatientsController.getInstance().listAll();
    }
    
}
