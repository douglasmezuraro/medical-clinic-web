package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.Doctor;
import br.uem.din.medicalclinic.utils.BaseList;
import br.uem.din.medicalclinic.utils.Populate;
import java.util.List;

public class DoctorsController implements ICadastrable<Doctor> {

    private static DoctorsController instance;
    private final BaseList<Doctor> list;
    private Doctor model;
    
    private DoctorsController() {
        list = new BaseList<>();
        list.add(Populate.doctor());
    } 
    
    public static DoctorsController getInstance() {
        if(instance == null) {
            instance = new DoctorsController();
        }
        return instance;
    }
    
    @Override
    public Doctor getModel() {
        return model;
    }

    @Override
    public String create() {
        model = new Doctor(); 
        return "create";
    }

    @Override
    public String doCreate(Doctor model) {
        list.add(model);
        return "index";
    }

    @Override
    public String edit(Doctor model) {
        this.model = model;
        return "edit";
    }

    @Override
    public String doEdit(Doctor model) {
        list.edit(model);
        return "index";
    }

    @Override
    public String delete(Doctor model) {
        list.remove(model);
        return "doctors";
    }

    @Override
    public String details(Doctor model) {
        this.model = model;
        return "details";
    }

    @Override
    public String index() {
        return "index";
    }

    @Override
    public List<Doctor> listAll() {
        return list.toList();
    }
    
}
