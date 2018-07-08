package br.uem.din.medicalclinic.bean.appointment;

import br.uem.din.medicalclinic.controller.AppointmentsController;
import br.uem.din.medicalclinic.model.Appointment;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "appointments.delete")
@SessionScoped
public class Delete implements Serializable {

    public String delete(Appointment model) {
        return AppointmentsController.getInstance().delete(model);
    }
}
