package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.Appointment;
import br.uem.din.medicalclinic.model.AppointmentType;
import br.uem.din.medicalclinic.model.Doctor;
import br.uem.din.medicalclinic.model.Patient;
import br.uem.din.medicalclinic.utils.BaseList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppointmentsController implements ICadastrable<Appointment> {

    private static AppointmentsController instance;
    private final BaseList<Appointment> list;
    private Appointment model;
    
    private AppointmentsController() {
        list = new BaseList<>();
    } 
    
    public static AppointmentsController getInstance() {
        if(instance == null) {
            instance = new AppointmentsController();
        }
        return instance;
    }
    
    @Override
    public Appointment getModel() {
        return model;
    }

    @Override
    public String create() {
        model = new Appointment(); 
        return "create";
    }

    @Override
    public String create(Appointment model) {
        list.add(model);
        return "index";
    }

    @Override
    public String edit() {
        return "index";
    }

    @Override
    public String edit(Appointment model) {
        this.model = model;
        return "edit";
    }

    @Override
    public String delete(Appointment model) {
        list.remove(model);
        return "appointments";
    }

    @Override
    public String details(Appointment model) {
        this.model = model;
        return "details";
    }

    @Override
    public String index() {
        return "index";
    }

    @Override
    public List<Appointment> listAll() {
        return list.toList();
    }
    
    public List<Doctor> listDoctors() {
        return DoctorsController.getInstance().listAll();
    }
    
    public List<Patient> listPatients() {
        return PatientsController.getInstance().listAll();
    }
    
    public List<AppointmentType> listAppointmentTypes() {
        return new ArrayList<>(Arrays.asList(AppointmentType.values()));
    }
    
}
