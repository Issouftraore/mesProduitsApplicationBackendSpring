package com.example.produitapplication.services;
import com.example.produitapplication.entities.Categorie;
import com.example.produitapplication.entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
    List<Produit> findByNomProduit(String nom);
    List<Produit> findByNomPrix(String nom , Double prix);
    List<Produit> findByNomProduitContains(String nom);
    List<Produit> findByCategorie(Categorie categorie);
    List<Produit> findByCategorieIdCat(Long id);
    List<Produit> findByOrderByNomProduitDesc();
    List<Produit> trierProduitNomPrix();



}
