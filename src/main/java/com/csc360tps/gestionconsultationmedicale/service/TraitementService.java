package com.csc360tps.gestionconsultationmedicale.service;

import java.util.List;

import com.csc360tps.gestionconsultationmedicale.model.Traitement;

public interface TraitementService {
    public List<Traitement> getAll();

    public Traitement findById(Long id);

    public Traitement save(Traitement traitement);

    public Traitement update(Traitement traitement);

    public void deleteById(Long id);

}
