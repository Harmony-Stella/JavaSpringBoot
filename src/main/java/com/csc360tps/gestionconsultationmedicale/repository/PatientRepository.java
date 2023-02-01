package com.csc360tps.gestionconsultationmedicale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csc360tps.gestionconsultationmedicale.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
