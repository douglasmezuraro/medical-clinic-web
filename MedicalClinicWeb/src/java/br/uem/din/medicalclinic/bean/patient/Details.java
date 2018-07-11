package br.uem.din.medicalclinic.bean.patient;

import br.uem.din.medicalclinic.controller.PatientsController;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "patientsDetails")
@SessionScoped
public class Details implements Serializable {

    private Integer id;
    private String name;
    private String lastName;
    private Date birth;
    private String address;
    private String contact;
    private String email;
    private String phone;

    public Details() {
        modelToView();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void modelToView(Patient model) {
        id = model.getId();
        name = model.getName();
        lastName = model.getLastName();
        birth = model.getBirth();
        address = model.getAddress();
        contact = model.getContact();
        email = model.getEmail();
        phone = model.getPhone();        
    }
    
}
