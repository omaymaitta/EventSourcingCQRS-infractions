package com.example.immatriculationmicroservice.immatriculationQuerySide.repositories;


import com.example.immatriculationmicroservice.immatriculationQuerySide.entities.Vehicule;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule, String> {
}

