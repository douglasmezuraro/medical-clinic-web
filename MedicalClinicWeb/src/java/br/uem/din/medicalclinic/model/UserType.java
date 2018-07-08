package br.uem.din.medicalclinic.model;

public enum UserType {
    Doctor("Médico"),
    Secretary("Secretário");
    
    private String description;
    
    UserType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
