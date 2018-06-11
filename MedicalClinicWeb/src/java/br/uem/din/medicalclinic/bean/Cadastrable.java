package br.uem.din.medicalclinic.bean;

import br.uem.din.medicalclinic.model.Base;
import java.util.List;

public interface Cadastrable<T extends Base> {
    
    public String index();
    public String add();
    public String create();
    public String edit(T object);
    public String edit();
    public String delete(T object);
    public List<T> listAll();
    public String details(T object);
          
}
