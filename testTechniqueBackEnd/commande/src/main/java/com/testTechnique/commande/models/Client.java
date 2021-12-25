package com.testTechnique.commande.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(	name = "client")
public class Client {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private String code;


	 	@Column(nullable = false)
	    private String nom;

	 	@Column(nullable = false)
	    private String prenom;
	 	
	 	@Column(nullable = false)
	    private LocalDate dateNaissance;
	 	
	 	@Column(nullable = false)
	    private String adresse;
	 	
	 	@Column(nullable = false)
	    private String ville;
	 	
	 	@Column(nullable = false)
	    private Long codePostal;
	   
	    private String tel;
	    
	    private String fax;
	    
	    @Column(nullable = false)
	    private String gsm;

	    @Column(nullable = false)
	    private String email;

		

		public Client(String nom, String prenom, LocalDate dateNaissance, String adresse, String ville, Long codePostal,
				String tel, String fax, String gsm, String email) {
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.adresse = adresse;
			this.ville = ville;
			this.codePostal = codePostal;
			this.tel = tel;
			this.fax = fax;
			this.gsm = gsm;
			this.email = email;
		}

		public Client() {
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public LocalDate getDateNaissance() {
			return dateNaissance;
		}

		public void setDateNaissance(LocalDate dateNaissance) {
			this.dateNaissance = dateNaissance;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public String getVille() {
			return ville;
		}

		public void setVille(String ville) {
			this.ville = ville;
		}

		public Long getCodePostal() {
			return codePostal;
		}

		public void setCodePostal(Long codePostal) {
			this.codePostal = codePostal;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getFax() {
			return fax;
		}

		public void setFax(String fax) {
			this.fax = fax;
		}

		public String getGsm() {
			return gsm;
		}

		public void setGsm(String gsm) {
			this.gsm = gsm;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


	   
	
}
