package com.abc.HospitalApp.HospitalApp.ENTITY;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "hospital")
public class ENTITY {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hospitalID;

    @NotBlank
    @Size(min = 3, max = 50, message = "Enter minimum 3 characters")
    private String hospitalName;

    @NotBlank
    @Size(min = 5, max = 50, message = "Enter minimum 5 characters")
    private String hospitalLocation;
    

    public ENTITY() {}

    public ENTITY(Long hospitalID, String hospitalName, String hospitalLocation) {
        this.hospitalID = hospitalID;
        this.hospitalName = hospitalName;
        this.hospitalLocation = hospitalLocation;
        
    }

    public Long getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(Long hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }
}
