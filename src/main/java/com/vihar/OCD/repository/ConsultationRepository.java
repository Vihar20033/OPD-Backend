package com.vihar.OCD.repository;

import com.vihar.OCD.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

    List<Consultation> findByAppointmentPatientId(Long patientId);
}
