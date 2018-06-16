package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.AgreementType;
import br.uem.din.medicalclinic.utils.BaseList;
import br.uem.din.medicalclinic.utils.View;
import br.uem.din.medicalclinic.model.Patient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "patientsController")
@SessionScoped
public class PatientsController implements Serializable, Cadastrable<Patient> {
 
    protected Patient object;
    protected BaseList<Patient> list = new BaseList<>();
    
    @Override
    public Patient getObject() {
        return object;
    }
    
    @Override
    public String create() {
        object = new Patient();
        return View.Create.toString();
    }
    
    @Override
    public String create(Patient object) {        
        list.add(object);
        return index();
    }    
    
    @Override
    public String edit() {
        return index();
    }
    
    @Override
    public String edit(Patient object) {
        this.object = object;
        return View.Edit.toString();
    }    
    
    @Override
    public String delete(Patient object) {
        list.delete(object);
        return index();
    }
    
    @Override 
    public String details(Patient object) {
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
    public List<Patient> listAll() {
        return list.getList();
    }    
    
    public List<AgreementType> listAgreementTypes() {
        List<AgreementType> agreementTypes = new ArrayList<>();
        
        for(AgreementType element: AgreementType.values())
            agreementTypes.add(element);
        
        return agreementTypes;
    }    
    
}
