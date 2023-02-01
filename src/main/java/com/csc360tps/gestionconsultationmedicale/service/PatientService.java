package com.csc360tps.gestionconsultationmedicale.service;

import java.util.List;

import com.csc360tps.gestionconsultationmedicale.model.Patient;

public interface PatientService {
    public List<Patient> getAll();

    public Patient findById(Long id);

    public Patient save(Patient medecin);

    public Patient update(Patient medecin);

    public void deleteById(Long id);

}
