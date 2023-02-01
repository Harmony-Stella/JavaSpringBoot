package com.csc360tps.gestionconsultationmedicale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csc360tps.gestionconsultationmedicale.model.Consultation;

public interface ConsultationRepository extends JpaRepository<Consultation,Long>{

}
