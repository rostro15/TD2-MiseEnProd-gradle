package org.polytech.covid.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient {
    
    @Id
    @GeneratedValue
    private long id;
    private String mail;
    private String phone;
    private String firstname;
    private String lastname;
    private Date birthdate;
    private Number nbVaccin;
    @OneToMany(mappedBy = "patient", cascade = {})
    private List<Rdv> rdvs;

    public Patient() {
        this.rdvs = new ArrayList<>();
    }

    public Patient(String firstname, String lastname, String mail, String phone, Date birthdate, Number nbVaccin) {
        setFirstname(firstname);
        setLastname(lastname);
        setMail(mail);
        setPhone(phone);
        setBirthdate(birthdate);
        setNbVaccin(nbVaccin);
        this.rdvs = new ArrayList<>();
    }
    
    // GET
    public long getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getMail() {
        return mail;
    }
    public String getPhone() {
        return phone;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public Number getNbVaccin() {
        return nbVaccin;
    }
    public List<Rdv> getRdvs() {
        return rdvs;
    }
    public Rdv getRdv(Integer id) {
        return rdvs.get(id);
    }

    // SET
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname= lastname;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setPhone(String phone) {
        this.phone= phone;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public void setNbVaccin(Number nbVaccin) {
        this.nbVaccin = nbVaccin;
    }
    public void addRdv(Rdv rdv) {
        this.rdvs.add(rdv);
    }
    public void removeRdv(Rdv rdv) {
        this.rdvs.remove(rdv);
    }


}
