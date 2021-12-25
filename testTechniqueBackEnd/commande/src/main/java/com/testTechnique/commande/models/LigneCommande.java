package com.testTechnique.commande.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ligneCommande")
public class LigneCommande {
	
	
	 @Column(nullable = false)
	 private Long qte;
	 
	 @Column(nullable = false)
	 private BigDecimal prixUnitaure;
	 
	 @Column(nullable = false)
		private BigDecimal prixTotal;
		
		@Column(nullable = false)
		private Long etat;
		
		@JsonBackReference
	    @ManyToOne(optional = false, fetch = FetchType.LAZY)
	    @JoinColumn(name = "commande_numero")
	    private Commande commande;

	    @ManyToOne(optional = false, fetch = FetchType.LAZY)
	    @JoinColumn(name = "produit_code")
	    private Produit produit;

		public LigneCommande(Long qte, BigDecimal prixUnitaure, BigDecimal prixTotal, Long etat, Commande commande,
				Produit produit) {
			super();
			this.qte = qte;
			this.prixUnitaure = prixUnitaure;
			this.prixTotal = prixTotal;
			this.etat = etat;
			this.commande = commande;
			this.produit = produit;
		}

		public Long getQte() {
			return qte;
		}

		public void setQte(Long qte) {
			this.qte = qte;
		}

		public BigDecimal getPrixUnitaure() {
			return prixUnitaure;
		}

		public void setPrixUnitaure(BigDecimal prixUnitaure) {
			this.prixUnitaure = prixUnitaure;
		}

		public BigDecimal getPrixTotal() {
			return prixTotal;
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
		
		public Commande getCommande() {
			return commande;
		}

		public void setCommande(Commande commande) {
			this.commande = commande;
		}

		public Produit getProduit() {
			return produit;
		}

		public void setProduit(Produit produit) {
			this.produit = produit;
		}
		   
}
