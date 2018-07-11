package br.uem.din.medicalclinic.utils;

import br.uem.din.medicalclinic.model.Base;
import java.util.ArrayList;
import java.util.List;

public class BaseList<T extends Base> {
    
    private final List<T> internalList = new ArrayList<>();
    
    public List<T> toList() {
        return internalList;
    }

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
        if(internalList.contains(element)) {
            return internalList.remove(element);
        }
        else {
            return internalList.remove(find(element.getId()));
        }
    }

    public boolean edit(T element) {
        remove(element);
        return add(element);
    }

    public T find(Integer id) {
        for(T element: internalList) {
            if(element.getId() == id) {
                return element;
            }
        }
        return null;
    }
        
}
