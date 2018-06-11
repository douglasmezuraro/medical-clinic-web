package br.uem.din.medicalclinic.utils;

import br.uem.din.medicalclinic.model.Base;
import java.util.ArrayList;
import java.util.List;

public class BaseList<T extends Base> {
    
    private List<T> list = new ArrayList<>();
    
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
    
    public boolean add(T element) {
        if(!list.contains(element)) {
            element.setId(generateId());
            return list.add(element);
        }
        else 
            return false;
    }   
    
    public boolean delete(T element) {
        if(list.contains(element))
            return list.remove(element);
        else
            return false;
    }
       
}
