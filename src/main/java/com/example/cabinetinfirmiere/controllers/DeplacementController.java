package com.example.cabinetinfirmiere.controllers;

import com.example.cabinetinfirmiere.models.Deplacement;
import com.example.cabinetinfirmiere.services.Deplacement;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


import com.example.cabinetinfirmiere.models.Deplacement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin

public class DeplacementController {

    private DeplacementService deplacement;

    public DeplacementController(Deplacement deplacement) {
        this.deplacement = deplacement;

    @GetMapping

    }
}


