package org.polytech.covid.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vaccination_center")
public class VaccinationCenter {

    @Id
    private Integer id;
    private String name;
    private String address;
    private String city;
    private String postalCode;
    @OneToMany(mappedBy = "vaccinationCenter", cascade = {})
    private List<Rdv> rdvs;



    public VaccinationCenter() {
        this.rdvs = new ArrayList<>();
    }


    public VaccinationCenter(
        Integer id,
        String name,
        String address,
        String city,
        String postalCode
    ){ 
        setId(id);
        setName(name);
        setAddress(address);
        setCity(city);
        setPostalCode(postalCode);
        this.rdvs = new ArrayList<>();
    }

    // GET
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public List<Rdv> getRdvs() {
        return this.rdvs;
    }
    public Rdv getRdv(Integer id) {
        return this.rdvs.get(id);
    }

    // SET
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city= city;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void addRdv(Rdv rdv) {
        this.rdvs.add(rdv);
    }
    public void removeRdv(Rdv rdv) {
        this.rdvs.remove(rdv);
    }
    

    

}
