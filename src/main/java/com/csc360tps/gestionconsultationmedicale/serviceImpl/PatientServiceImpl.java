package com.csc360tps.gestionconsultationmedicale.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc360tps.gestionconsultationmedicale.model.Patient;
import com.csc360tps.gestionconsultationmedicale.repository.PatientRepository;
import com.csc360tps.gestionconsultationmedicale.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	public PatientRepository patientRepository;
	
    @Override
    public List<Patient> getAll() {
        return this.patientRepository.findAll();
    }

    @Override
    public Patient findById(Long id) {
        return this.patientRepository.findById(id).orElse(null);
    }

    @Override
    public Patient save(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Patient update(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public void deleteById(Long id) {
        this.patientRepository.deleteById(id);
    }

}

