package br.uem.din.medicalclinic.bean.doctor;

import br.uem.din.medicalclinic.controller.DoctorsController;
import br.uem.din.medicalclinic.model.Doctor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "doctorsDelete")
@SessionScoped
public class Delete implements Serializable {

    public Delete() {
        
    }

    public String delete(Doctor model) {
        return DoctorsController.getInstance().delete(model);
    }

}
