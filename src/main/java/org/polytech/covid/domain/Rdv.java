package org.polytech.covid.domain;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rdv")
public class Rdv {
    
    @Id
    @GeneratedValue
    private int id;
    private Date date;
    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private Patient patient;
    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private DBUser user;
    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private VaccinationCenter vaccinationCenter;

    public Rdv( Date date, Patient patient, DBUser user, VaccinationCenter vaccinationCenter) {
        setDate(date);
        setPatient(patient);
        setDBUser(user);
        setVaccinationCenter(vaccinationCenter);
    }

    // GET
    public long getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public Patient getPatient() {
        return patient;
    }
    public DBUser getDBUser() {
        return this.user;
    }
    public VaccinationCenter getVaccinationCenter() {
        return vaccinationCenter;
    }


    // SET
    public void setId(Integer id) {
        this.id = id;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void setDBUser(DBUser user) {
        this.user = user;
    }
    public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
        this.vaccinationCenter = vaccinationCenter;
    }

}
