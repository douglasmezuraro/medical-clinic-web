package br.uem.din.medicalclinic.model;

import java.util.Date;

public class Appointment extends Base {

    private Date date;
    private Doctor doctor;
    private Patient patient;
    private AppointmentType appointmentType;

    public Appointment() {
        doctor = new Doctor();
        patient = new Patient();
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public AppointmentType getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(AppointmentType appointmentType) {
        this.appointmentType = appointmentType;
    }
    
}
