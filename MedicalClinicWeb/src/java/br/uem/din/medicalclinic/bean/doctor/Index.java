package br.uem.din.medicalclinic.bean.doctor;

import br.uem.din.medicalclinic.controller.DoctorsController;
import br.uem.din.medicalclinic.model.Doctor;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "doctorsIndex")
@RequestScoped
public class Index implements Serializable {
    
    public Index() {
        
    }

    public String edit(Doctor model) {
        return DoctorsController.getInstance().edit(model);
    }

    public String delete(Doctor model) {
        return DoctorsController.getInstance().delete(model);
    }
    
    public String details(Doctor model) {
        return DoctorsController.getInstance().details(model);
    }
    
    public String create() {
        return DoctorsController.getInstance().create();
    }    

    public String index() {
        return DoctorsController.getInstance().index();
    }    
    
    public List<Doctor> listAll() {
        return DoctorsController.getInstance().listAll();
    }
    
}
