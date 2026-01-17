package com.vihar.OCD.controller;

import com.vihar.OCD.entity.Appointment;
import com.vihar.OCD.entity.Consultation;
import com.vihar.OCD.repository.AppointmentRepository;
import com.vihar.OCD.repository.ConsultationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultations")
@CrossOrigin("*")
public class ConsultationController {

    private final ConsultationRepository consultationRepository;
    private final AppointmentRepository appointmentRepository;

    public ConsultationController(ConsultationRepository consultationRepository,
                                  AppointmentRepository appointmentRepository) {
        this.consultationRepository = consultationRepository;
        this.appointmentRepository = appointmentRepository;
    }

    @PostMapping
    public Consultation addConsultation(@RequestParam Long appointmentId,
                                        @RequestBody Consultation consultation) {

        Appointment appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));

        consultation.setAppointment(appointment);

        appointment.setConsultationCompleted(true);
        appointmentRepository.save(appointment);

        return consultationRepository.save(consultation);
    }

    @GetMapping("/patient/{patientId}")
    public List<Consultation> getByPatient(@PathVariable Long patientId) {
        return consultationRepository.findByAppointmentPatientId(patientId);
    }
}
