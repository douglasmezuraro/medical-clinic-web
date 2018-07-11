package br.uem.din.medicalclinic.controller;

import br.uem.din.medicalclinic.model.User;
import br.uem.din.medicalclinic.model.UserType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersController {

    private static UsersController instance;
    private User loggedUser;
     
    private UsersController() {
           
    } 

    public User getLoggedUser() {
        return loggedUser;
    }
    
    public static UsersController getInstance() {
        if(instance == null) {
            instance = new UsersController();
        }
        return instance;
    }
    
    private List<? extends User> getList(UserType userType) {
        switch(userType) {
            case Doctor: return DoctorsController.getInstance().listAll();
            case Secretary: return SecretariesController.getInstance().listAll();
            default: return null;
        }
    }
    
    private String getPage(UserType userType) {
        switch(userType) {
            case Doctor: return "doctors";
            case Secretary: return "secretaries";
            default: return "index";
        }        
    }
    
    private boolean doLogin(UserType userType, String login, String password) {
        for(User user: getList(userType)) {
            if(user.getLogin().equalsIgnoreCase(login) && (user.getPassword().equalsIgnoreCase(login))) {
                loggedUser = user;
                return true;
            }
        }
        return false;
    }
    
    public String login(UserType userType, String login, String password) {
        if(doLogin(userType, login, password)) {
            return getPage(userType);
        }
        return "index";
    }
    
    public List<UserType> listUserTypes() {
        return new ArrayList<>(Arrays.asList(UserType.values()));
    }
    
}
