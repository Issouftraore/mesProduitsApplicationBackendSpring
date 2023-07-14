package com.example.produitapplication.repos;
import com.example.produitapplication.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
@RepositoryRestResource(path = "cat")
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}

