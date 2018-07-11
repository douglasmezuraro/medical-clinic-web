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

@Named(value = "appointmentsEdit")
@SessionScoped
public class Edit implements Serializable {
    
    private Integer id;
    private Patient patient;
    private Appointment doctor;
    private Date date;
    private AppointmentType appointmentType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

        id = model.getId();
        patient = model.getPatient();
        doctor = model.getDoctor();
        date = model.getDate();
        appointmentType = model.getAppointmentType();     
    }

    public Appointment viewToModel() {
        Appointment model = AppointmentsController.getInstance().getModel();
       
        model.setId(id);
        model.setPatient(patient);
        model.setDoctor(doctor);
        model.setDate(date);
        model.setAppointmentType(appointmentType);

        return model;
    }
    
    public String edit() {
        return AppointmentsController.getInstance().edit(viewToModel());
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
