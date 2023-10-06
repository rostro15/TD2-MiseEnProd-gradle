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
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Number nbVaccin;
    @OneToMany(mappedBy = "patient", cascade = {})
    private List<Rdv> rdvs;

    public Patient(String firstName, String lastName, String mail, String phone, Date birthDate, Number nbVaccin) {
        setFirstName(firstName);
        setLastName(lastName);
        setMail(mail);
        setPhone(phone);
        setBirthDate(birthDate);
        setNbVaccin(nbVaccin);
        this.rdvs = new ArrayList<>();
    }
    
    // GET
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMail() {
        return mail;
    }
    public String getPhone() {
        return phone;
    }
    public Date getBirthDate() {
        return birthDate;
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
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName= lastName;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setPhone(String phone) {
        this.phone= phone;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
