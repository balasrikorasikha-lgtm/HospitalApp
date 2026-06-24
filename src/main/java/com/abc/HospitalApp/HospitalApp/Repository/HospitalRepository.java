package com.abc.HospitalApp.HospitalApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.abc.HospitalApp.HospitalApp.ENTITY.ENTITY;

@Repository
public interface HospitalRepository extends JpaRepository<ENTITY, Long> {
}
