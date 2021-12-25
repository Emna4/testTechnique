package com.testTechnique.commande.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "commande")
public class Commande {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String numero;
	
	 @JsonManagedReference
	    @OneToMany(mappedBy = "commande")
	    private List<LigneCommande> ligneCommande = new ArrayList<>();
	 
	@Column(nullable = false)
	private LocalDate date;
	
	@Column(nullable = false)
	private BigDecimal prixTotal;
	
	@Column(nullable = false)
	private Long etat;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public List<LigneCommande> getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(List<LigneCommande> ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Transient
	public BigDecimal getPrixTotal() {
		BigDecimal sum = null;
        List<LigneCommande> ligneCommande = getLigneCommande();
        for (LigneCommande lc : ligneCommande) {
            sum= sum.add(lc.getPrixTotal());
        }
        return sum;
	}

	public void setPrixTotal(BigDecimal prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Long getEtat() {
		return etat;
	}

	public void setEtat(Long etat) {
		this.etat = etat;
	}

	
}
