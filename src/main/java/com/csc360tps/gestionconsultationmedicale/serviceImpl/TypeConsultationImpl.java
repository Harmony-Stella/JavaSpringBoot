package com.csc360tps.gestionconsultationmedicale.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc360tps.gestionconsultationmedicale.model.TypeConsultation;
import com.csc360tps.gestionconsultationmedicale.repository.TypeConsultationRepository;
import com.csc360tps.gestionconsultationmedicale.service.TypeConsultationService;

@Service
public class TypeConsultationImpl implements TypeConsultationService {
	
	@Autowired
	public TypeConsultationRepository typeConsultationRepository;
	
    @Override
    public List<TypeConsultation> getAll() {
        return this.typeConsultationRepository.findAll();
    }

    @Override
    public TypeConsultation findById(Long id) {
        return this.typeConsultationRepository.findById(id).orElse(null);
    }

    @Override
    public TypeConsultation save(TypeConsultation typeConsultation) {
        return this.typeConsultationRepository.save(typeConsultation);
    }

    @Override
    public TypeConsultation update(TypeConsultation typeConsultation) {
        return this.typeConsultationRepository.save(typeConsultation);
    }

    @Override
    public void deleteById(Long id) {
        this.typeConsultationRepository.deleteById(id);
    }

}

