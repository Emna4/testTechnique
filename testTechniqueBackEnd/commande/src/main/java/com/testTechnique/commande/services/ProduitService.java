package com.testTechnique.commande.services;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testTechnique.commande.models.Produit;
import com.testTechnique.commande.repositories.ProduitRepository;

@Service
public class ProduitService {

	@Autowired ProduitRepository produitRepository;
	
	    public Iterable<Produit> getAllProducts() {
	        return produitRepository.findAll();
	    }

	    

	    
	    public Produit save(Produit product) {
	        return produitRepository.save(product);
	    }

	    
}
