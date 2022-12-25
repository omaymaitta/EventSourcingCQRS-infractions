package com.example.radarmicroservice.radar_Query.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.radarmicroservice.radar_Query.entities.Radar;


public interface RadarRepository extends JpaRepository<Radar,String> {

}
