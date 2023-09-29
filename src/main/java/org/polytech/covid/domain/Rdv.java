package org.polytech.covid.domain;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rdv")
public class Rdv {
    
    @Id
    private Integer id;
    private Date date;
    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private Patient patient;
    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private Doctor doctor;
    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private VaccinationCenter vaccinationCenter;

    public Rdv(Integer id, Date date, Patient patient, Doctor doctor, VaccinationCenter vaccinationCenter) {
        setId(id);
        setDate(date);
        setPatient(patient);
        setDoctor(doctor);
        setVaccinationCenter(vaccinationCenter);
    }

    // GET
    public Integer getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public Patient getPatient() {
        return patient;
    }
    public Doctor getDoctor() {
        return doctor;
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
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
        this.vaccinationCenter = vaccinationCenter;
    }

}
