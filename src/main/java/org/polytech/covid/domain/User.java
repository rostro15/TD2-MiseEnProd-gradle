package org.polytech.covid.domain;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    
    protected String login;
    protected String password;
    protected String mail;
    protected String phone;
    protected String firstname;
    protected String lastname;

    public User(String login, String password, String mail, String phone, String firstname, String lastname) {
        setLogin(login);
        setPassword(password);
        setMail(mail);
        setPhone(phone);
        setFirstname(firstname);
        setLastname(lastname);
    }

    // GET
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public String getMail() {
        return mail;
    }
    public String getPhone() {
        return phone;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }

    // SET
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password= password;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setPhone(String phone) {
        this.phone= phone;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname= lastname;
    }

}
