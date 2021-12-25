package com.testTechnique.commande.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.testTechnique.commande.models.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, String>{

}
