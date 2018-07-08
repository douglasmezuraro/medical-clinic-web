package br.uem.din.medicalclinic.utils;

import br.uem.din.medicalclinic.model.AgreementType;
import br.uem.din.medicalclinic.model.Doctor;
import br.uem.din.medicalclinic.model.Patient;
import java.sql.Date;

public class Populate {
 
    public static Patient patient() {
        Patient patient = new Patient();
     
        patient.setName("Mikael");
        patient.setLastName("Åkerfeldt");
        patient.setAgreementType(AgreementType.particular);
        patient.setBirth(Date.valueOf("1974-04-17"));
        patient.setContact("Anna Sandberg");
        patient.setEmail("mikael@akerfeldt.com");
        patient.setPhone("(99)99911-2233");
        
        return patient;
    }
    
    public static Doctor doctor() {
        Doctor doctor = new Doctor();
        
        doctor.setName("David");
        doctor.setLastName("Gilmour");
        doctor.setBirth(Date.valueOf("1946-03-06"));
        doctor.setContact("Polly Samson");
        doctor.setEmail("david@gilmour.com");
        doctor.setPhone("(99)99922-3333");
        
        return doctor;
    }
    
}
