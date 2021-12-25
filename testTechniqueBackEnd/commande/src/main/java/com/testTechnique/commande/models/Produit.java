package com.testTechnique.commande.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(	name = "produit")
public class Produit {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private String code;
	 
	 @JsonManagedReference
	    @OneToMany(mappedBy = "produit")
	    private List<LigneCommande> ligneCommande = new ArrayList<>();
	 
	 @Column(nullable = false)
	 	private String marque;
	 
	 @Column(nullable = false)
	 	private String modele;
	 
	 @Column(nullable = false)
	 	private String caracteristiques;
	 
	 @Column(nullable = false)
	 	private BigDecimal prixUnitaire;
	 
	 @Column(nullable = false)
	 	private Long quantite;

	  @ManyToOne(fetch = FetchType.LAZY)
	    @JoinTable(	name = "categorie_produit",
	            joinColumns = @JoinColumn(name = "categorie_code"),
	            inverseJoinColumns = @JoinColumn(name = "produit_code"))
	    private Set<Categorie> categorie = new HashSet<>();
	  
	public Produit(String marque, String modele, String caracteristiques, BigDecimal prixUnitaire, Long quantite) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.caracteristiques = caracteristiques;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
	}

	 
}
