package com.example.produitapplication.restcontrollers;

import com.example.produitapplication.entities.Categorie;
import com.example.produitapplication.repos.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cat")
@CrossOrigin("*")
public class CategorieRESTController {

    @Autowired
    CategorieRepository categorieRepository;


    @GetMapping("/toto/lili")
    public List<Categorie> getAllCategories(){
        return categorieRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Categorie getCategorieById(@PathVariable("id") Long id){
        return categorieRepository.findById(id).get();
    }

    @PostMapping
    public  Categorie createCategorie(@RequestBody Categorie categorie){
        return categorieRepository.save(categorie);
    }
}
