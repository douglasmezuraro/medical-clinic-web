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

@Named(value = "appointments.create")
@SessionScoped
public class Create implements Serializable {

    public Appointment getModel() {
        return AppointmentsController.getInstance().getModel();
    }
    
    public String create() {
        return AppointmentsController.getInstance().create();
    }
    
    public String create(Appointment model) {
        return AppointmentsController.getInstance().create(model);
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
