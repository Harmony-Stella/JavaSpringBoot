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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("Medecin")
@Table(name="medecin")
public class Medecin extends Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="specialite",nullable=false)
	private String specialite;
	
	/*Ajout de la relation OneToOne entre medecin et Consultation*/
	@OneToOne(mappedBy = "mededcin",fetch = FetchType.LAZY)
	private Set<Consultation> consultations;
	
	/*Ajout de la relation ManyToOne entre medecin et typeconsultation*/
    @ManyToOne()
    @JoinColumn(name = "type_consulation_id")
    private TypeConsultation typeConsultation;
    
	/*Ajout de la relation OneToOne entre medecin et consultation*/
    @OneToOne()
    @JoinColumn(name = "consultation_id")
    private Consultation consultation;
    
    
	public Medecin() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Set<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(Set<Consultation> consultations) {
		this.consultations = consultations;
	}


	
	public Medecin(Long id, String nom, String prenom, Integer numeroTelephone, String adresse, String specialite) {
		super(id,nom,prenom,numeroTelephone,adresse,specialite);

	}
	
	@Override
	public String toString() {
		return "Medecin [id=" + id + ", specialite=" + specialite + ", consultations=" + consultations + ", consultation=" + consultation + "]";
	}

	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}


}

