package br.uem.din.medicalclinic.bean.doctor;

import br.uem.din.medicalclinic.controller.DoctorsController;
import br.uem.din.medicalclinic.model.Doctor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;

@Named(value = "doctorsEdit")
@SessionScoped
public class Edit implements Serializable {

    private Integer id;
    private String name;
    private String lastName;
    private Date birth;
    private String address;
    private String contact;
    private String email;
    private String phone;

    public Edit() {
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

    public void modelToView() {
        Doctor model = DoctorsController.getInstance().getModel();

        name = model.getName();
        lastName = model.getLastName();
        birth = model.getBirth();
        address = model.getAddress();
        contact = model.getContact();
        email = model.getEmail();
        phone = model.getPhone();        
    }

    public Doctor viewToModel() {
        Doctor model = DoctorsController.getInstance().getModel();
       
        model.setName(name);
        model.setLastName(lastName);
        model.setBirth(birth);
        model.setAddress(address);
        model.setContact(contact);
        model.setEmail(email);
        model.setPhone(phone);

        return model;
    }
       
    public String edit() {
        return DoctorsController.getInstance().doEdit(viewToModel());
    }   
    
}
