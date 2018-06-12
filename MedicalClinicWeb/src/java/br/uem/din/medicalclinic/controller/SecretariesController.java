package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.utils.BaseList;
import br.uem.din.medicalclinic.utils.View;
import br.uem.din.medicalclinic.model.Secretary;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "secretariesController")
@SessionScoped
public class SecretariesController implements Serializable, Cadastrable<Secretary> {
 
    protected Secretary object;
    protected BaseList<Secretary> list = new BaseList<>();
    
    @Override
    public Secretary getObject() {
        return object;
    }
    
    @Override
    public String create() {
        object = new Secretary();
        return View.Create.toString();
    }
    
    @Override
    public String create(Secretary object) {        
        list.add(object);
        return index();
    }    
    
    @Override
    public String edit() {
        return index();
    }
    
    @Override
    public String edit(Secretary object) {
        this.object = object;
        return View.Edit.toString();
    }    
    
    @Override
    public String delete(Secretary object) {
        list.delete(object);
        return index();
    }
    
    @Override 
    public String details(Secretary object) {
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
    public List<Secretary> listAll() {
        return list.getList();
    }    
    
}
