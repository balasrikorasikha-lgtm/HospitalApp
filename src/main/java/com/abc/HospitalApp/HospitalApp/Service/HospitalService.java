package com.abc.HospitalApp.HospitalApp.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.HospitalApp.HospitalApp.ENTITY.ENTITY;
import com.abc.HospitalApp.HospitalApp.Repository.HospitalRepository;
@Service
public class HospitalService {
  @Autowired
  private HospitalRepository hospitalRepository;

  // Create hospital
  public ENTITY createHospital(ENTITY hospital) {
      return hospitalRepository.save(hospital);
  }

  // Read all hospitals
  public List<ENTITY> getAllHospital() {
      return hospitalRepository.findAll();
  }

  // Read particular hospital
  public Optional<ENTITY> getHospitalById(Long id) {
      return hospitalRepository.findById(id);
  }

  // Delete hospital
  public void deleteHospital(Long id) {
      hospitalRepository.deleteById(id);
  }
}