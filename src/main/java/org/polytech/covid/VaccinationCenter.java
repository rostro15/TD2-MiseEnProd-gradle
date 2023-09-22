package org.polytech.covid;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vaccination_center")
public class VaccinationCenter {

    @Id
    private Integer id;
    private String name;
    private String address;
    private String city;
    private String postalCode;

    

}
