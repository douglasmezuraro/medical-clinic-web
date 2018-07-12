package br.uem.din.medicalclinic.utils;

import br.uem.din.medicalclinic.model.Base;
import java.util.ArrayList;
import java.util.List;

public class BaseList<T extends Base> {
    
    private final List<T> internalList = new ArrayList<>();
    
    private Integer newId() {
        Integer id = 0;
        for(T element: internalList) {
            id = id < element.getId() ? element.getId() : id;
        }
        return ++id;
    }        
    
    public boolean add(T element) {
        if(internalList.contains(element)) {
            return false;
        }
        element.setId(newId());
        return internalList.add(element);
    }   
 
    public boolean remove(T element) {
        return internalList.remove(element);
    }

    public boolean edit(T element) {
        return internalList.contains(element);
    }
    
    public List<T> toList() {
        return internalList;
    }
        
}
