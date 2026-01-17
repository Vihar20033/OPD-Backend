package com.vihar.OCD.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "consultations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    private String bp;
    private String temperature;

    @Column(length = 1000)
    private String notes;
}
