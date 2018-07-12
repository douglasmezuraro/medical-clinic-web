package br.uem.din.medicalclinic.bean.secretary;

import br.uem.din.medicalclinic.controller.SecretariesController;
import br.uem.din.medicalclinic.model.Secretary;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;

@Named(value = "secretariesCreate")
@RequestScoped
public class Create implements Serializable {

    private String name;
    private String lastName;
    private Date birth;
    private String address;
    private String contact;
    private String email;
    private String phone;

    public Create() {

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

    @PostConstruct
    public void modelToView() {
        Secretary model = SecretariesController.getInstance().getModel();

        name = model.getName();
        lastName = model.getLastName();
        birth = model.getBirth();
        address = model.getAddress();
        contact = model.getContact();
        email = model.getEmail();
        phone = model.getPhone();        
    }

    public Secretary viewToModel() {
        Secretary model = SecretariesController.getInstance().getModel();
       
        model.setName(name);
        model.setLastName(lastName);
        model.setBirth(birth);
        model.setAddress(address);
        model.setContact(contact);
        model.setEmail(email);
        model.setPhone(phone);

        return model;
    }
    
    public String create() {
        return SecretariesController.getInstance().doCreate(viewToModel());
    }
       
}
