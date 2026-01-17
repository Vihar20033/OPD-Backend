package com.vihar.OCD.controller;

import com.vihar.OCD.entity.Patient;
import com.vihar.OCD.repository.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@CrossOrigin("*")
public class PatientController {

    private final PatientRepository repo;

    public PatientController(PatientRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return repo.save(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    @GetMapping("/search")
    public List<Patient> search(@RequestParam String keyword) {
        return repo.findByNameContainingIgnoreCaseOrPhoneContaining(keyword, keyword);
    }
}
