package br.uem.din.medicalclinic.bean.user;

import br.uem.din.medicalclinic.controller.UsersController;
import br.uem.din.medicalclinic.model.UserType;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "usersLogin")
@RequestScoped
public class Login implements Serializable {

    private String login;
    private String password;
    private UserType userType;

    public Login() {
        
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    
    public List<UserType> listUserTypes() {
        return UsersController.getInstance().listUserTypes();
    }    
    
    public String login() {
        return UsersController.getInstance().login(userType, login, password);
    }        
    
}
