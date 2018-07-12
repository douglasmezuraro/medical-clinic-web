package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.Secretary;
import br.uem.din.medicalclinic.utils.BaseList;
import br.uem.din.medicalclinic.utils.Populate;
import java.util.List;

public class SecretariesController implements ICadastrable<Secretary> {

    private static SecretariesController instance;
    private final BaseList<Secretary> list;
    private Secretary model;
    
    private SecretariesController() {
        list = new BaseList<>();
        list.add(Populate.secretary());
    } 
    
    public static SecretariesController getInstance() {
        if(instance == null) {
            instance = new SecretariesController();
        }
        return instance;
    }
    
    @Override
    public Secretary getModel() {
        return model;
    }

    @Override
    public String create() {
        model = new Secretary(); 
        return "create";
    }

    @Override
    public String doCreate(Secretary model) {
        list.add(model);
        return "index";
    }

    @Override
    public String edit(Secretary model) {
        this.model = model;
        return "edit";
    }

    @Override
    public String doEdit(Secretary model) {
        list.edit(model);
        return "index";
    }

    @Override
    public String delete(Secretary model) {
        list.remove(model);
        return "secretaries";
    }

    @Override
    public String details(Secretary model) {
        this.model = model;
        return "details";
    }

    @Override
    public String index() {
        return "index";
    }

    @Override
    public List<Secretary> listAll() {
        return list.toList();
    }
    
}
