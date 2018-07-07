package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.Base;
import java.util.List;

public interface ICadastrable<T extends Base> {
    
    public T getModel();    
    public String create();    
    public String create(T model);    
    public String edit();    
    public String edit(T model);    
    public String delete(T model);  
    public String details(T model); 
    public String index();    
    public List<T> listAll();
          
}
