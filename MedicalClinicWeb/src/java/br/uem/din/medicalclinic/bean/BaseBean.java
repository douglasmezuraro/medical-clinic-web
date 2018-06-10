package br.uem.din.medicalclinic.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "baseBean")
@SessionScoped
public abstract class BaseBean implements Serializable {
   
}
