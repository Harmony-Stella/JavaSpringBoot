package com.csc360tps.gestionconsultationmedicale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csc360tps.gestionconsultationmedicale.model.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {

}
