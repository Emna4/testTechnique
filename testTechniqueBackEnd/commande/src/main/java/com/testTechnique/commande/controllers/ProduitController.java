package com.testTechnique.commande.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testTechnique.commande.models.Produit;
import com.testTechnique.commande.services.ProduitService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/produit")
public class ProduitController {

	@Autowired ProduitService produitService;
	
	//afficher tous les produits
	 @GetMapping("/getAll")
	    public Iterable<Produit> getAll() {
	        return produitService.getAllProducts();
	    }
}
