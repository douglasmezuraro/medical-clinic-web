package br.uem.din.medicalclinic.bean.appointment;

import br.uem.din.medicalclinic.controller.AppointmentsController;
import br.uem.din.medicalclinic.model.Appointment;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "appointmentsIndex")
@RequestScoped
public class Index implements Serializable {
    
    public Index() {
        
    }

    public String edit(Appointment model) {
        return AppointmentsController.getInstance().edit(model);
    }

    public String delete(Appointment model) {
        return AppointmentsController.getInstance().delete(model);
    }
    
    public String details(Appointment model) {
        return AppointmentsController.getInstance().details(model);
    }
    
    public String create() {
        return AppointmentsController.getInstance().create();
    }    

    public String index() {
        return AppointmentsController.getInstance().index();
    }
    
    public List<Appointment> listAll() {
        return AppointmentsController.getInstance().listAll();
    }
    
}
