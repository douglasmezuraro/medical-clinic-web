package br.uem.din.medicalclinic.model;

public enum AgreementType {
      
    particular("Particular"),
    healthInsurance("Plano de saúde");
    
    private String description;
    
    AgreementType(String description) {
        this.description = description;
    } 
    
}
