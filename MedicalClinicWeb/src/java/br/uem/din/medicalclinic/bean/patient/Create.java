package br.uem.din.medicalclinic.bean.patient;

import br.uem.din.medicalclinic.controller.PatientsController;
import br.uem.din.medicalclinic.model.AgreementType;
import br.uem.din.medicalclinic.model.Patient;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;

@Named(value = "patientsCreate")
@RequestScoped
public class Create implements Serializable {

    private String name;
    private String lastName;
    private Date birth;
    private String address;
    private String contact;
    private String email;
    private String phone;
    private AgreementType agreementType;

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

    public AgreementType getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
    }
    
    @PostConstruct
    public void modelToView() {
        Patient model = PatientsController.getInstance().getModel();

        name = model.getName();
        lastName = model.getLastName();
        birth = model.getBirth();
        address = model.getAddress();
        contact = model.getContact();
        email = model.getEmail();
        phone = model.getPhone();  
        agreementType = model.getAgreementType();
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
        model.setAgreementType(agreementType);

        return model;
    }
    
    public String create() {
        return PatientsController.getInstance().doCreate(viewToModel());
    }
    
    public List<AgreementType> listAgreementTypes() {
        return PatientsController.getInstance().listAgreementTypes();
    }    
       
}
