package com.csc360tps.gestionconsultationmedicale.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc360tps.gestionconsultationmedicale.model.Consultation;
import com.csc360tps.gestionconsultationmedicale.repository.ConsultationRepository;
import com.csc360tps.gestionconsultationmedicale.service.ConsultationService;

@Service
public class ConsultationServiceImpl implements ConsultationService{
	
	@Autowired
	public ConsultationRepository consultationRepository;
	
    @Override
    public List<Consultation> getAll() {
        return this.consultationRepository.findAll();
    }

    @Override
    public Consultation findById(Long id) {
        return this.consultationRepository.findById(id).orElse(null);
    }

    @Override
    public Consultation save(Consultation consultation) {
        return this.consultationRepository.save(consultation);
    }

    @Override
    public Consultation update(Consultation consultation) {
        return this.consultationRepository.save(consultation);
    }

    @Override
    public void deleteById(Long id) {
        this.consultationRepository.deleteById(id);
    }

}

