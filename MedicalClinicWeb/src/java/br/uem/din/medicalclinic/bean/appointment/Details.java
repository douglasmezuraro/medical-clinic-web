package br.uem.din.medicalclinic.bean.appointment;

import br.uem.din.medicalclinic.controller.AppointmentsController;
import br.uem.din.medicalclinic.model.Appointment;
import br.uem.din.medicalclinic.model.AppointmentType;
import br.uem.din.medicalclinic.model.Doctor;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;

@Named(value = "appointmentsDetails")
@RequestScoped
public class Details implements Serializable {
    
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private AppointmentType appointmentType;

    public Details() {
     
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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

    @PostConstruct
    public void modelToView() {
        Appointment model = AppointmentsController.getInstance().getModel();

        patient = model.getPatient();
        doctor = model.getDoctor();
        date = model.getDate();
        appointmentType = model.getAppointmentType();     
    }
   
}
