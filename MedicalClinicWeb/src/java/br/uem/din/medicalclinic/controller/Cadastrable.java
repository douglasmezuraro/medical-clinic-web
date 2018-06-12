package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.Base;
import java.util.List;

public interface Cadastrable<T extends Base> {
    
    public T getObject();    
    public String create();    
    public String create(T object);    
    public String edit();    
    public String edit(T object);    
    public String delete(T object);  
    public String details(T object); 
    public String index();    
    public String mainMenu();
    public List<T> listAll();
          
}
