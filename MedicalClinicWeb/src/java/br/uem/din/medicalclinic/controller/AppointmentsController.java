package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.utils.BaseList;
import br.uem.din.medicalclinic.utils.View;
import br.uem.din.medicalclinic.model.Appointment;
import br.uem.din.medicalclinic.model.AppointmentType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "appointmentsController")
@SessionScoped
public class AppointmentsController implements Serializable, Cadastrable<Appointment> {
 
    protected Appointment object;
    protected BaseList<Appointment> list = new BaseList<>();
    
    @Override
    public Appointment getObject() {
        return object;
    }
    
    @Override
    public String create() {
        object = new Appointment();
        return View.Create.toString();
    }
    
    @Override
    public String create(Appointment object) {        
        list.add(object);
        return index();
    }    
    
    @Override
    public String edit() {
        return index();
    }
    
    @Override
    public String edit(Appointment object) {
        this.object = object;
        return View.Edit.toString();
    }    
    
    @Override
    public String delete(Appointment object) {
        list.delete(object);
        return index();
    }
    
    @Override 
    public String details(Appointment object) {
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
    public List<Appointment> listAll() {
        return list.getList();
    }    
    
    public List<AppointmentType> listAppointmentTypes() {
        List<AppointmentType> list = new ArrayList<>();
        for(AppointmentType element: AppointmentType.values())
            list.add(element);
        return list;
    }
    
}
