package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.utils.BaseList;
import br.uem.din.medicalclinic.utils.View;
import br.uem.din.medicalclinic.model.Doctor;
import br.uem.din.medicalclinic.utils.PersonGenerator;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "doctorsController")
@SessionScoped
public class DoctorsController implements Serializable, Cadastrable<Doctor> {
 
    protected Doctor object;
    protected BaseList<Doctor> list = new BaseList<>();
    
    public DoctorsController() {
        PersonGenerator gen = new PersonGenerator();
        for(int i = 0; i < 4; i++) {
            Doctor d = (Doctor)gen.generate();
            list.add(d);
        }
    }
    
    @Override
    public Doctor getObject() {
        return object;
    }
    
    @Override
    public String create() {
        object = new Doctor();
        return View.Create.toString();
    }
    
    @Override
    public String create(Doctor object) {        
        list.add(object);
        return index();
    }    
    
    @Override
    public String edit() {
        return index();
    }
    
    @Override
    public String edit(Doctor object) {
        this.object = object;
        return View.Edit.toString();
    }    
    
    @Override
    public String delete(Doctor object) {
        list.delete(object);
        return index();
    }
    
    @Override 
    public String details(Doctor object) {
        this.object = object;
        return View.Details.toString();
    }
    
    @Override
    public String index() {
        return View.Index.toString();
    }
    
    @Override
    public String mainMenu() {
        return View.MainMenu.toString();
    }
    
    @Override
    public List<Doctor> listAll() {
        return list.getList();
    }  
    
}
