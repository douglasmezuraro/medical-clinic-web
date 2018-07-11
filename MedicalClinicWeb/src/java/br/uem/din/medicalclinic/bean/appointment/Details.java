package br.uem.din.medicalclinic.bean.appointment;

import br.uem.din.medicalclinic.controller.AppointmentsController;
import br.uem.din.medicalclinic.model.Appointment;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "appointmentsDetails")
@SessionScoped
public class Details implements Serializable {
    
    private Patient patient;
    private Appointment doctor;
    private Date date;
    private AppointmentType appointmentType;

    public Details() {
        modelToView();
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Appointment getAppointment() {
        return doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }    

    public AppointmentType getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(AppointmentType appointmentType) {
        this.appointmentType = appointmentType;
    }

    public void modelToView() {
        Appointment model = AppointmentsController.getInstance().getModel();

        patient = model.getPatient();
        doctor = model.getDoctor();
        date = model.getDate();
        appointmentType = model.getAppointmentType();     
    }
   
}
