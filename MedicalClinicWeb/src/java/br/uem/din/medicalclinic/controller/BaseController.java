package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.Base;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseController<T extends Base> {
    
    protected List<T> list;
    
    protected BaseController() {
        list = new ArrayList<>();
    }

    public void add(T object) {
        if(!list.contains(object)) {
            object.setId(generateId());
            list.add(object);
        }
    }
    
    public void edit(T oject) {}
    
    public void delete(T object) {
        if(list.contains(object))
            list.remove(object);
    }
    
    public List<T> getList() {
        return list;
    }
    
    private int generateId() {
        int higherId = 0;
        
        for(T element: list) {
            if(element.getId() > higherId)
                higherId = element.getId();
        }
     
        return higherId + 1;
    }    
}
