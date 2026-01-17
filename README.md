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

### ✅ Optional
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

## ⚙️ Database Setup (SQL Server)

### ✅ 1) Create Database
Run this in SSMS:

```sql
CREATE DATABASE OPD_DB;
GO
USE OPD_DB;
GO
✅ 2) Configure application.properties
properties
Copy code
server.port=8082

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=OPD_DB;encrypt=true;trustServerCertificate=true
spring.datasource.username=sa
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
✅ Hibernate will auto-create tables when you run the application.

▶️ How to Run the Project
✅ 1) Clone the repo
bash
Copy code
git clone https://github.com/Vihar20033/OPD-Backend.git
cd OPD-Backend
✅ 2) Run Spring Boot
bash
Copy code
mvn spring-boot:run
Backend will start at:
📌 http://localhost:8082

✅ API Endpoints
✅ Patient APIs
Method	Endpoint	Description
POST	/api/patients	Add patient
GET	/api/patients	List patients
GET	/api/patients/search?keyword=...	Search patient by name/phone

✅ Appointment APIs
Method	Endpoint	Description
POST	/api/appointments?patientId=1&doctorName=Dr%20Amit&dateTime=2026-01-17T16:30	Book appointment
GET	/api/appointments/today	List today appointments

✅ Consultation APIs
Method	Endpoint	Description
POST	/api/consultations?appointmentId=1	Create consultation + mark complete
GET	/api/consultations/patient/{patientId}	Get patient consultation history

✅ Auth API (Test)
Method	Endpoint	Description
GET	/api/auth/login	Check login success

✅ Reports API (Optional)
Method	Endpoint	Description
GET	/api/reports/today-summary	Total/Completed/Pending summary

✅ Sample Consultation Request
POST /api/consultations?appointmentId=1

json
Copy code
{
  "bp": "120/80",
  "temperature": "98.6",
  "notes": "Patient is stable."
}
👨‍💻 Author
Vihar Chudasama

yaml
Copy code

---

✅ If you want, I’ll also give you a **README for Frontend (Angular)** and a clean project structure f
