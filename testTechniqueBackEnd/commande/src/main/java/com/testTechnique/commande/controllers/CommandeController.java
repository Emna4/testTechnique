package com.testTechnique.commande.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.testTechnique.commande.models.Commande;
import com.testTechnique.commande.models.LigneCommande;
import com.testTechnique.commande.repositories.CommandeRepository;
import com.testTechnique.commande.services.CommandeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/commande")
public class CommandeController {

	@Autowired
	CommandeService commandeService;
	
	
	//ajouter commande
	@PostMapping("/ajouter")
	public ResponseEntity<Commande> create(@RequestBody Commande commande) {
	    List<LigneCommande> lc = commande.getLigneCommande();
	    Commande comsaved = commandeService.ajouter(commande);
        return new ResponseEntity<>(comsaved, HttpStatus.OK);
       
	}
	//afficher toutes les commandes
	 @GetMapping("/list")
	 public ResponseEntity<List<Commande>> getAll() {
	        try {
	          
	            List<Commande> commandes =(List<Commande>) commandeService.getAllOrders();


	            if (commandes.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }

	            return new ResponseEntity<>(commandes, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	 //update commande
    @PutMapping("edit/{num}")

    public ResponseEntity<Commande> updateCommande(@PathVariable("num") String num, @RequestBody Commande commande) {
  

    	Commande comupdated= commandeService.modifier(num,commande);
            return new ResponseEntity<>(HttpStatus.OK);
    }
    
    //retirer commande
    @DeleteMapping("delete/{num}")

    public ResponseEntity<Commande> suppCommande(@PathVariable("num") String num) {
  
    	 commandeService.retirer(num);
    	 return new ResponseEntity<>(HttpStatus.OK);
          
    }
        
}
