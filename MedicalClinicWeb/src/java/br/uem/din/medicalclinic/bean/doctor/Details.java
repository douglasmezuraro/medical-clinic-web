package br.uem.din.medicalclinic.bean.doctor;

import br.uem.din.medicalclinic.controller.DoctorsController;
import br.uem.din.medicalclinic.model.Doctor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "doctors.details")
@SessionScoped
public class Details implements Serializable {
    
    public Doctor getModel() {
        return DoctorsController.getInstance().getModel();
    }
    
    public String details(Doctor model) {
        return DoctorsController.getInstance().details(model);
    }
}
