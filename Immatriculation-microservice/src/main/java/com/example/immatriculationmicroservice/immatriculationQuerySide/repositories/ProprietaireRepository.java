package com.example.immatriculationmicroservice.immatriculationQuerySide.repositories;


import com.example.immatriculationmicroservice.immatriculationQuerySide.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietaireRepository extends JpaRepository<Proprietaire, String> {
}
