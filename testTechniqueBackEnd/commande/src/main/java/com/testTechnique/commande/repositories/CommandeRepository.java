package com.testTechnique.commande.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testTechnique.commande.models.Commande;


@Repository
public interface CommandeRepository extends JpaRepository<Commande, String>{


}
