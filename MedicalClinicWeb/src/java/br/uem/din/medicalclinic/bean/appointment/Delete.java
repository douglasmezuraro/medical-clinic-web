package br.uem.din.medicalclinic.bean.appointment;

import br.uem.din.medicalclinic.controller.AppointmentsController;
import br.uem.din.medicalclinic.model.Appointment;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;

@Named(value = "appointmentsDelete")
@RequestScoped
public class Delete implements Serializable {

    public Delete() {
        
    }

    public String delete(Appointment model) {
        return AppointmentsController.getInstance().delete(model);
    }
    
}
