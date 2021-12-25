package com.testTechnique.commande.services;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testTechnique.commande.models.Commande;
import com.testTechnique.commande.repositories.CommandeRepository;

@Service
public class CommandeService {

	@Autowired
	CommandeRepository commandeRepository;
	
	//afficher toutes les commandes
	    public Iterable<Commande> getAllOrders() {
	        return this.commandeRepository.findAll();
	    }
		
	 //ajouter une nouvelle commande   
	    public Commande ajouter(Commande order) {
	        order.setDate(LocalDate.now());
	        return this.commandeRepository.save(order);
	    }

	 //modifier commande
	    public Commande modifier(String code, Commande order) {
	    	Commande comm = getByNumero(code).get();
	
	    		  comm.setPrixTotal(order.getPrixTotal());
	    		  return this.commandeRepository.save(comm);
	    	
	       
	    }
	   
	    //retirer commande
	    public void retirer(String numCommande) {
	        this.commandeRepository.deleteById(numCommande);
	    }
//afficher une commande par code
	    public Optional<Commande> getByNumero(String numCommande) {
	       return this.commandeRepository.findById(numCommande);
	    }
}
