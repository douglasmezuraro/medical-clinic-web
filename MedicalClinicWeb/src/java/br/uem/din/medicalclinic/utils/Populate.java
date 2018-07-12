package br.uem.din.medicalclinic.utils;

import br.uem.din.medicalclinic.model.AgreementType;
import br.uem.din.medicalclinic.model.Doctor;
import br.uem.din.medicalclinic.model.Patient;
import br.uem.din.medicalclinic.model.Secretary;
import java.sql.Date;

public class Populate {
 
    public static Patient patient() {
        Patient model = new Patient();
     
        model.setName("João");
        model.setLastName("Silva");
        model.setAgreementType(AgreementType.particular);
        model.setBirth(Date.valueOf("1974-04-17"));
        model.setContact("Maria Aparecida");
        model.setEmail("joao.silva@gmail.com");
        model.setPhone("(99)99911-2233");
        
        return model;
    }
    
    public static Doctor doctor() {
        Doctor model = new Doctor();
        
        model.setName("Carolina");
        model.setLastName("Costa");
        model.setBirth(Date.valueOf("1946-03-06"));
        model.setContact("Fernando Nascimento");
        model.setEmail("carolina.costa@gmail.com");
        model.setPhone("(99)99922-3333");
        model.setLogin("medico");
        model.setPassword("medico");
        
        return model;
    }
    
    public static Secretary secretary() {
        Secretary model = new Secretary();
        
        model.setName("Natan");
        model.setLastName("Ferreira");
        model.setBirth(Date.valueOf("1995-01-27"));
        model.setEmail("natan.ferreira@gmail.com");
        model.setPhone("(99)99911-1173");
        model.setLogin("secretario");
        model.setPassword("secretario");
        
        return model;    
    }
    
}
