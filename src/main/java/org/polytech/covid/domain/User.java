package org.polytech.covid.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    
    @Id
    protected String login;
    protected String password;
    protected String mail;
    protected String phone;
    protected String firstName;
    protected String lastName;

    public User(String login, String password, String mail, String phone, String firstName, String lastName) {
        setLogin(login);
        setPassword(password);
        setMail(mail);
        setPhone(phone);
        setFirstName(firstName);
        setLastName(lastName);
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
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
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
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName= lastName;
    }

}
