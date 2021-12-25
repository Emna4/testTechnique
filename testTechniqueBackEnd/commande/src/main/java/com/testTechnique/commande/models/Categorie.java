package com.testTechnique.commande.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Categorie {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private String code;
	 
	 	private String libelle;
}
