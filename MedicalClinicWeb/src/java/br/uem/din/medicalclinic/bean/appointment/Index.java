package br.uem.din.medicalclinic.bean.appointment;

import br.uem.din.medicalclinic.controller.AppointmentsController;
import br.uem.din.medicalclinic.model.Appointment;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "appointments.index")
@SessionScoped
public class Index implements Serializable {
    
    public List<Appointment> listAll() {
        return AppointmentsController.getInstance().listAll();
    }
    
}
