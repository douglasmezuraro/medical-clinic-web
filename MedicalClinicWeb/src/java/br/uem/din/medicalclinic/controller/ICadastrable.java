package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.Base;
import java.util.List;

public interface ICadastrable<T extends Base> {
    
    /**
     * Retorna o modelo
     */
    public T getModel();

    /**
     * Retorna a view de cadastro
     */
    public String create();    
    
    /**
     * Efetiva o cadastro
     */
    public String doCreate(T model);    

    /**
     * Retorna a view de edição
     */
    public String edit(T model);
    
    /**
     * Efetiva a edição do modelo
     */
    public String doEdit(T model);
    
    /**
     * Deleta o modelo
     */
    public String delete(T model);  

    /**
     * Retorna a view de detalhes
     */
    public String details(T model); 

    /**
     * Retorna a view de início
     */
    public String index();    

    /**
     * Retorna todos os modelos
     */
    public List<T> listAll();
          
}
