package br.uem.din.medicalclinic.bean.appointment;

import br.uem.din.medicalclinic.controller.AppointmentsController;
import br.uem.din.medicalclinic.model.Appointment;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "appointments.details")
@SessionScoped
public class Details implements Serializable {
    
    public Appointment getModel() {
        return AppointmentsController.getInstance().getModel();
    }
    
    public String details(Appointment model) {
        return AppointmentsController.getInstance().details(model);
    }
        
}
