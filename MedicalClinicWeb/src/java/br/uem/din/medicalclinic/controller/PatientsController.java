package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.AgreementType;
import br.uem.din.medicalclinic.model.Patient;
import br.uem.din.medicalclinic.utils.BaseList;
import br.uem.din.medicalclinic.utils.Populate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatientsController implements ICadastrable<Patient> {

    private static PatientsController instance;
    private final BaseList<Patient> list;
    private Patient model;
    
    private PatientsController() {
        list = new BaseList<>();
        list.add(Populate.patient());
    } 
    
    public static PatientsController getInstance() {
        if(instance == null) {
            instance = new PatientsController();
        }
        return instance;
    }
    
    @Override
    public Patient getModel() {
        return model;
    }

    @Override
    public String create() {
        model = new Patient(); 
        return "create";
    }

    @Override
    public String create(Patient model) {
        list.add(model);
        return "index";
    }

    @Override
    public String edit() {
        return "index";
    }

    @Override
    public String edit(Patient model) {
        this.model = model;
        return "edit";
    }

    @Override
    public String delete(Patient model) {
        list.remove(model);
        return "patients";
    }

    @Override
    public String details(Patient model) {
        this.model = model;
        return "details";
    }

    @Override
    public String index() {
        return "index";
    }

    @Override
    public List<Patient> listAll() {
        return list.toList();
    }
    
    public List<AgreementType> listAgreementTypes() {
        return new ArrayList<>(Arrays.asList(AgreementType.values()));
    }
        
}
