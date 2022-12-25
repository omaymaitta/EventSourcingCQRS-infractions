package com.example.fractionmicroservice.infractionQuerySide.repositories;

import com.example.fractionmicroservice.infractionQuerySide.entities.Infraction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction,String> {

}
