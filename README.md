# 🏥 OPD Mini Module - Backend (Spring Boot + JPA + SQL Server)

This is a demo-ready **OPD Mini Module Backend** built using **Spring Boot**, **Spring Data JPA**, and **Microsoft SQL Server (SSMS)**.

It covers the basic OPD flow:
✅ Patient Registration  
✅ Appointment Booking  
✅ Consultation Summary  
✅ Basic Authentication (Spring Security Basic Auth)  
✅ Sample Report API  

---

## 🚀 Tech Stack
- Java 17+
- Spring Boot
- Spring Web (REST APIs)
- Spring Data JPA (Hibernate)
- Spring Security (Basic Auth)
- Microsoft SQL Server (SSMS)
- Maven

---

## ✅ Modules Implemented

### ✅ 1) Patient Registration
- Add Patient (name, gender, age, phone)
- List Patients
- Search by Name OR Phone

### ✅ 2) Appointment Booking
- Book appointment for a patient with doctor name and date/time
- List today’s appointments

### ✅ 3) Consultation Summary
- Add vitals (BP + Temperature) and notes for an appointment
- Mark consultation as completed
- View completed consultations for a patient

### ✅ Optional Features
- Basic Login using Spring Security (In-memory user)
- Sample Report: Today summary

---

## 🔐 Authentication (Basic Login)

This project uses **Spring Security Basic Authentication**.

✅ Default User:
- Username: `doctor`
- Password: `12345`

All APIs require authentication except:
- `/api/auth/**`

---



