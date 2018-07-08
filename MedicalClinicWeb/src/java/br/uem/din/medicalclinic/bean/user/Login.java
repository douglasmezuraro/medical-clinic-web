package br.uem.din.medicalclinic.bean.user;

import br.uem.din.medicalclinic.controller.UsersController;
import br.uem.din.medicalclinic.model.UserType;
import br.uem.din.medicalclinic.model.User;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "users.login")
@SessionScoped
public class Login implements Serializable {

    private User model;
    
    private Login() {
        model = new User();
    }

    public User getModel() {
        return model;
    }

    public void setModel(User model) {
        this.model = model;
    }
    
    public User getLoggedUser() {
        return UsersController.getInstance().getLoggedUser();
    }
        
    public List<UserType> listUserTypes() {
        return UsersController.getInstance().listUserTypes();
    }    
    
    public String login() {
        return UsersController.getInstance().login(
                model.getUserType(), 
                model.getLogin(), 
                model.getPassword());
    }    
    
}
