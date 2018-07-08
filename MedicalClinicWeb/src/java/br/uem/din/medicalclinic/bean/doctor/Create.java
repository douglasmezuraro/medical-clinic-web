package br.uem.din.medicalclinic.bean.doctor;

import br.uem.din.medicalclinic.controller.DoctorsController;
import br.uem.din.medicalclinic.model.Doctor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "doctors.create")
@SessionScoped
public class Create implements Serializable {

    public Doctor getModel() {
        return DoctorsController.getInstance().getModel();
    }
    
    public String create() {
        return DoctorsController.getInstance().create();
    }
    
    public String create(Doctor model) {
        return DoctorsController.getInstance().create(model);
    }
       
}
