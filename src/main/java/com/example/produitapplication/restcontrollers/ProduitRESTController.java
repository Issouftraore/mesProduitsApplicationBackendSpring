package com.example.produitapplication.restcontrollers;
import com.example.produitapplication.entities.Produit;
import com.example.produitapplication.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class ProduitRESTController {

    @Autowired
    ProduitService produitService;
@RequestMapping(method= GET)
    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }
    @RequestMapping(value ="/{id}",method = GET)
    public Produit getProduitById(@PathVariable("id") Long id){
    return produitService.getProduit(id);
    }
    @RequestMapping(method = POST)
    public Produit createProduit(@RequestBody Produit produit){
        return produitService.saveProduit(produit);
    }
    @RequestMapping(method = PUT)
    public Produit updateProduit(@RequestBody Produit produit){
        return produitService.updateProduit(produit);
    }
    @RequestMapping(value ="/{id}",method = DELETE)
    public void  deleteProduit(@PathVariable("id") Long id){
    produitService.deleteProduitById(id);
    }
    @RequestMapping( value = "/prodscat/{idCat}",method= GET)
    public List<Produit> getProduitByCatId(@PathVariable("idCat") Long idCat){
        return produitService.findByCategorieIdCat(idCat);
    }
}
