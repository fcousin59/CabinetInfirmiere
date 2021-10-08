package com.example.cabinetinfirmiere.services;

import com.example.cabinetinfirmiere.models.Deplacement;
import java.util.List;
import java.util.Optional;

public interface DeplacementService {

public interface CinemaService {
    public List<Deplacement> findALL();
    public Optional<Deplacement> findById(String id);
    public Deplacement saves(Deplacement deplacement);
    public Deplacement update(Deplacement deplacement);
    public Optional<Deplacement> delete(String id);
}