package br.uem.din.medicalclinic.utils;

import br.uem.din.medicalclinic.model.Doctor;
import br.uem.din.medicalclinic.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class PersonGenerator {
    
    private final List<String> names = new ArrayList<>(Arrays.asList(getNames()));
    private final List<String> lastNames = new ArrayList<>(Arrays.asList(getLastNames()));
    private final List<String> emailDomains = new ArrayList<>(Arrays.asList(getEmailDomais()));
    
    private String[] getNames() {
        return new String[]{
            "João", 
            "Mateus", 
            "Tiago", 
            "André", 
            "Carlos",
            "Ana", 
            "Laura", 
            "Beatriz", 
            "Camila"};
    }
    
    private String[] getLastNames() {
        return new String[]{
            "Silva",
            "Almeida",
            "Souza",
            "Ribeiro",
            "Cruz",
            "Costa",
            "das Neves",
            "Oliveira"};
    }
    
    private String[] getEmailDomais() {
        return new String[]{
            "gmail",
            "hotmail",
            "outlook",
            "bol",
            "yahoo",
            "uem"};
    }
    
    private void shuffle() {
        Collections.shuffle(names);
        Collections.shuffle(lastNames);
        Collections.shuffle(emailDomains);
    }        
    
    public Person generate() {        
        final int FIRST_ELEMENT = 0;        
        
        shuffle();
        Person object = new Person();
        
        object.setName(names.get(FIRST_ELEMENT));
        object.setLastName(lastNames.get(FIRST_ELEMENT));
        object.setEmail(String.format("%s.%s@%s.com", object.getName(), object.getLastName(), emailDomains.get(FIRST_ELEMENT)));
        shuffle();
        object.setContact(String.format("%s %s", names.get(FIRST_ELEMENT), lastNames.get(FIRST_ELEMENT)));
        
        
        return object;        
    }
    
}
