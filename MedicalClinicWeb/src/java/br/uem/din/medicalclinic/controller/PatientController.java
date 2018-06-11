package br.uem.din.medicalclinic.controller;

public class PatientController extends BaseController {
    
    private static PatientController instance;
    
    public static PatientController getInstance() {
        if(instance == null)
            instance = new PatientController();
        return instance;
    }
    
}
