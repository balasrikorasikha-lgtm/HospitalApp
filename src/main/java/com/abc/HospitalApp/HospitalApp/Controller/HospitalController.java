package com.abc.HospitalApp.HospitalApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.abc.HospitalApp.HospitalApp.ENTITY.ENTITY;
import com.abc.HospitalApp.HospitalApp.Service.HospitalService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    // Create hospital
    @PostMapping("/create")
    public ENTITY createHospital(@RequestBody ENTITY hospitalDetails) {
         return hospitalService.createHospital(hospitalDetails);
         
        
    }

    // Get all hospitals
    @GetMapping("/all")
    public List<ENTITY> getAllHospitals() {
        return hospitalService.getAllHospital();
    }

    // Get hospital by ID
    @GetMapping("/{id}")
    public Optional<ENTITY> getHospitalById(@PathVariable Long id) {
        return hospitalService.getHospitalById(id);
    }

    // Delete hospital by ID
    @DeleteMapping("/{id}")
    public String deleteHospital(@PathVariable Long id) {
        hospitalService.deleteHospital(id);
        return "Hospital deleted successfully!";
    }
}
