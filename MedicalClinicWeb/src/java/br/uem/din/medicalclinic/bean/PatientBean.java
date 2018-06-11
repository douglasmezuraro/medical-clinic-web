package br.uem.din.medicalclinic.bean;

import br.uem.din.medicalclinic.controller.PatientController;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "patientBean")
@SessionScoped
public class PatientBean implements Serializable, Cadastrable<Patient> {
    
    private Patient patient;
    private Patient clone;
    
    public PatientBean() {
        patient = new Patient();
    }        
   
    public Patient getPatient() {
        return patient;
    }
    
    @Override
    public String add() {
        PatientController.getInstance().add(patient);
        return "index";
    }
    
    @Override
    public List<Patient> listAll() {
        return PatientController.getInstance().getList();
    }
    
    @Override
    public String create() {
        patient = new Patient();
        return "create";
    }
    
    @Override
    public String index() {
        return "Secretary/index";
    }
    
    @Override
    public String edit(Patient object) {
        patient = object;
        return "edit";
    }
    
    @Override
    public String edit() {
        return "index";
    }
    
    @Override
    public String delete(Patient object) {
        PatientController.getInstance().delete(object);
        return "index";
    }
    
    @Override
    public String details(Patient object) {
        patient = object;
        return "details";
    }
    
}
