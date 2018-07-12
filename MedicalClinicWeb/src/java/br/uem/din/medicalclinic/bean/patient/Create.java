package br.uem.din.medicalclinic.bean.patient;

import br.uem.din.medicalclinic.controller.PatientsController;
import br.uem.din.medicalclinic.model.AgreementType;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Named(value = "patientsCreate")
@SessionScoped
public class Create implements Serializable {

    private String name;
    private String lastName;
    private Date birth;
    private String address;
    private String contact;
    private String email;
    private String phone;

    public Create() {
        modelToView();
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
        Patient model = PatientsController.getInstance().getModel();

        name = model.getName();
        lastName = model.getLastName();
        birth = model.getBirth();
        address = model.getAddress();
        contact = model.getContact();
        email = model.getEmail();
        phone = model.getPhone();        
    }

    public Patient viewToModel() {
        Patient model = PatientsController.getInstance().getModel();
       
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
        return PatientsController.getInstance().doCreate(viewToModel());
    }
    
    public List<AgreementType> listAgreementTypes() {
        return PatientsController.getInstance().listAgreementTypes();
    }    
       
}
