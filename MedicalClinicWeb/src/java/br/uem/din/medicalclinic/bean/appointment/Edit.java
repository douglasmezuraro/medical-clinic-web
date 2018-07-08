package br.uem.din.medicalclinic.bean.appointment;

import br.uem.din.medicalclinic.controller.AppointmentsController;
import br.uem.din.medicalclinic.model.Appointment;
import br.uem.din.medicalclinic.model.AppointmentType;
import br.uem.din.medicalclinic.model.Doctor;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "appointments.edit")
@SessionScoped
public class Edit implements Serializable {

    public Appointment getModel() {
        return AppointmentsController.getInstance().getModel();
    }
       
    public String edit() {
        return AppointmentsController.getInstance().edit();
    }
    
    public String edit(Appointment model) {
        return AppointmentsController.getInstance().edit(model);
    }
    
    public List<Doctor> listDoctors() {
        return AppointmentsController.getInstance().listDoctors();
    }
    
    public List<Patient> listPatients() {
        return AppointmentsController.getInstance().listPatients();
    }    
    
    public List<AppointmentType> listAppointmentTypes() {
        return AppointmentsController.getInstance().listAppointmentTypes();
    }    
    
}
