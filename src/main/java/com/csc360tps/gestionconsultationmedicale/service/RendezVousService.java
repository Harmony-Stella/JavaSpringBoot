package com.csc360tps.gestionconsultationmedicale.service;

import java.util.List;

import com.csc360tps.gestionconsultationmedicale.model.RendezVous;

public interface RendezVousService{
    public List<RendezVous> getAll();

    public RendezVous findById(Long id);

    public RendezVous save(RendezVous rendezVous);

    public RendezVous update(RendezVous rendezVous);

    public void deleteById(Long id);

}
