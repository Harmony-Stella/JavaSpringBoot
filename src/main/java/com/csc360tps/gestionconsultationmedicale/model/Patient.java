package com.csc360tps.gestionconsultationmedicale.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("Patient")
@Table(name="patient")
public class Patient extends Personne{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long id;
	
	@Column(name="personne_prevenir",nullable=false)
	public String personnePrevenir;
	
	/*Ajout de la relation OneToOne entre patient et Consultation*/
	@OneToOne(mappedBy = "patient",fetch = FetchType.LAZY)
	private Set<Consultation> consultations;
	
	/*Ajout de la relation OneToOne entre patient et rendez-vous*/
    @OneToOne()
    @JoinColumn(name = "rendez_vous_id",referencedColumnName = "id")
    private RendezVous rendezVous;

	
	public Patient() {

	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonnePrevenir() {
		return personnePrevenir;
	}
	public void setPersonnePrevenir(String personnePrevenir) {
		this.personnePrevenir = personnePrevenir;
	}
	
	public Patient(Long id, String nom, String prenom, Integer numeroTelephone, String adresse,
			String personnePrevenir) {
		super(id,nom,prenom,numeroTelephone,adresse,personnePrevenir);

	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", personnePrevenir=" + personnePrevenir + ", consultations=" + consultations
				+ ", rendezVous=" + rendezVous + "]";
	}

	public Set<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(Set<Consultation> consultations) {
		this.consultations = consultations;
	}

	public RendezVous getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(RendezVous rendezVous) {
		this.rendezVous = rendezVous;
	}

}

