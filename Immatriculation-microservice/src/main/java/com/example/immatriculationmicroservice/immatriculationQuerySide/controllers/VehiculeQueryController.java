package com.example.immatriculationmicroservice.immatriculationQuerySide.controllers;

import com.example.commonapi.query.GetAllVehiculesQuery;
import com.example.commonapi.query.GetVehiculeById;

import com.example.immatriculationmicroservice.immatriculationQuerySide.entities.Vehicule;

import com.example.immatriculationmicroservice.immatriculationQuerySide.repositories.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule/queries")
@CrossOrigin("*")
public class VehiculeQueryController {
    private QueryGateway queryGateway;
    private VehiculeRepository vehiculeRepository;

    @GetMapping("/allVehicules")
    public List<Vehicule> getAllVehicules() {
        return queryGateway.query(new GetAllVehiculesQuery(), ResponseTypes.multipleInstancesOf(Vehicule.class)).join();
    }

    @QueryHandler
    public List<Vehicule> on(GetAllVehiculesQuery query) {
        return vehiculeRepository.findAll();
    }

    @GetMapping("/getVehicule/{id}")
    public Vehicule getVehicule(@PathVariable String id) {
        return queryGateway.query(new GetVehiculeById(id),ResponseTypes.instanceOf(Vehicule.class)).join();
    }

    @QueryHandler
    public Vehicule on(GetVehiculeById query) {
        return vehiculeRepository.findById(query.getId()).orElse(null);
    }
    
}
