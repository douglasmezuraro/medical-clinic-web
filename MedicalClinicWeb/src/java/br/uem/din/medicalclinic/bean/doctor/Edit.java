package br.uem.din.medicalclinic.bean.doctor;

import br.uem.din.medicalclinic.controller.DoctorsController;
import br.uem.din.medicalclinic.model.Doctor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "doctors.edit")
@SessionScoped
public class Edit implements Serializable {

    public Doctor getModel() {
        return DoctorsController.getInstance().getModel();
    }
       
    public String edit() {
        return DoctorsController.getInstance().edit();
    }
    
    public String edit(Doctor model) {
        return DoctorsController.getInstance().edit(model);
    }
    
}
