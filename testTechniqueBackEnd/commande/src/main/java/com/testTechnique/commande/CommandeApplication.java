package com.testTechnique.commande;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.testTechnique.commande.models.Produit;
import com.testTechnique.commande.services.ProduitService;

@SpringBootApplication
public class CommandeApplication {
	
	@Autowired Produit produit;
	public static void main(String[] args) {
		SpringApplication.run(CommandeApplication.class, args);
		
}
	Produit p1 = new Produit("zara","pull","coton",new BigDecimal("220"),new Long(300));
	Produit p2 = new Produit("pull and bear","jupe","coton",new BigDecimal("120"),new Long(500));
	Produit p3 = new Produit("coton","echarpe","coton",new BigDecimal("400"),new Long(100));
	@Bean
	CommandLineRunner runner(ProduitService produitService) {
	    return args -> {
	    	produitService.save(p1);
	    	produitService.save(p2);
	    	produitService.save(p3);

	};
}
}