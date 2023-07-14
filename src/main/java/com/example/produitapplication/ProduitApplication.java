package com.example.produitapplication;

import com.example.produitapplication.entities.Categorie;
import com.example.produitapplication.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.MetadataConfiguration;
import org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@SpringBootApplication
public class ProduitApplication  implements CommandLineRunner {

   /*@Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;*/

    public static void main(String[] args) {
        SpringApplication.run(ProduitApplication.class, args);

    }
    @Override
    public void run(String ... args) throws Exception{
        //repositoryRestConfiguration.exposeIdsFor(Produit.class, Categorie.class);
    }

}
