package com.vihar.OCD.controller;

import com.vihar.OCD.entity.Appointment;
import com.vihar.OCD.entity.Patient;
import com.vihar.OCD.repository.AppointmentRepository;
import com.vihar.OCD.repository.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin("*")
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;

    public AppointmentController(AppointmentRepository appointmentRepository,
                                 PatientRepository patientRepository) {
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
    }

    // ✅ Book Appointment
    @PostMapping
    public Appointment bookAppointment(@RequestParam Long patientId,
                                       @RequestParam String doctorName,
                                       @RequestParam String dateTime) {

        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        Appointment appt = new Appointment();
        appt.setPatient(patient);
        appt.setDoctorName(doctorName);
        appt.setAppointmentDateTime(LocalDateTime.parse(dateTime));
        // format: 2026-01-17T15:30

        return appointmentRepository.save(appt);
    }

    // ✅ List Today Appointments
    @GetMapping("/today")
    public List<Appointment> todayAppointments() {

        LocalDate today = LocalDate.now();
        LocalDateTime start = today.atStartOfDay();
        LocalDateTime end = today.plusDays(1).atStartOfDay();

        return appointmentRepository.findByAppointmentDateTimeBetween(start, end);
    }
}
