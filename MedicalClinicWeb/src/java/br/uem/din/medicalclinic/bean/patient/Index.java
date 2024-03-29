package br.uem.din.medicalclinic.bean.patient;

import br.uem.din.medicalclinic.controller.PatientsController;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "patientsIndex")
@RequestScoped
public class Index implements Serializable {
    
    public Index() {
        
    }

    public String edit(Patient model) {
        return PatientsController.getInstance().edit(model);
    }

    public String delete(Patient model) {
        return PatientsController.getInstance().delete(model);
    }
    
    public String details(Patient model) {
        return PatientsController.getInstance().details(model);
    }
    
    public String create() {
        return PatientsController.getInstance().create();
    }    

    public String index() {
        return PatientsController.getInstance().index();
    }    

    public List<Patient> listAll() {
        return PatientsController.getInstance().listAll();
    }
    
}
