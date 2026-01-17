package com.vihar.OCD.repository;

import com.vihar.OCD.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByNameContainingIgnoreCaseOrPhoneContaining(String name, String phone);
}
