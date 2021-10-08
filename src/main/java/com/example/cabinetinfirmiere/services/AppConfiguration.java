package com.example.cabinetinfirmiere.services;

import com.example.cabinetinfirmiere.repository.DeplacementRepository;
import com.example.cabinetinfirmiere.repository.DeplacementService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class AppConfiguration {

    @Bean
    public DeplacementService deplacementService(DeplacementRepository deplacementrepository){
        return new DeplacementService(deplacementrepository) {
        };

    }

}
