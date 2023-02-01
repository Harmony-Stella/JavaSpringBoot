package com.csc360tps.gestionconsultationmedicale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csc360tps.gestionconsultationmedicale.model.Traitement;

public interface TraitementRepository extends JpaRepository<Traitement, Long> {

}
