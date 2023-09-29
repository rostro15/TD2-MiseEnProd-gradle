package org.polytech.covid.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "doctor")
public class Doctor extends User {

    @Id
    private Integer id;

    @OneToMany(mappedBy = "doctor", cascade = {})
    private List<Rdv> rdvs;

    public Doctor(String login, String password, String mail, String phone, String firstName, String lastName) {
        super(login, password, mail, phone, firstName, lastName);
        this.rdvs = new ArrayList<>();
    }

    // GET
    public List<Rdv> getRdvs() {
        return rdvs;
    }
    public Rdv getRdv(Integer id) {
        return rdvs.get(id);
    }


    // SET
    public void addRdv(Rdv rdv) {
        this.rdvs.add(rdv);
    }
    public void removeRdv(Rdv rdv) {
        this.rdvs.remove(rdv);
    }


}
