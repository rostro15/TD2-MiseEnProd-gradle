package org.polytech.covid.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "dbuser")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class DBUser {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    protected String username;
    protected String password;
    protected String mail;
    protected String phone;
    protected String firstname;
    protected String lastname;
    protected String role;

    public DBUser(String username, String password, String mail, String phone, String firstname, String lastname, String role) {
        setUsername(username);
        setPassword(password);
        setMail(mail);
        setPhone(phone);
        setFirstname(firstname);
        setLastname(lastname);
        setRole(role);
    }

    // GET
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public String getMail() {
        return this.mail;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getFirstname() {
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    public String getRole() {
        return this.role;
    }

    // SET
    public void setUsername(String username) {
        this.username = username;
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
    public void setRole(String role) {
        this.role = role;
    }

}
