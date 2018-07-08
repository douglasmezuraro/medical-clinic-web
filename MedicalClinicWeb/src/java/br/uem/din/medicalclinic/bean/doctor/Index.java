package br.uem.din.medicalclinic.bean.doctor;

import br.uem.din.medicalclinic.controller.DoctorsController;
import br.uem.din.medicalclinic.model.Doctor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "doctors.index")
@SessionScoped
public class Index implements Serializable {
    
    public List<Doctor> listAll() {
        return DoctorsController.getInstance().listAll();
    }
    
}
