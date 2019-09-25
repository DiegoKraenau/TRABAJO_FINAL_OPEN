package edu.rapisolver.rapisolverApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.rapisolver.rapisolverApp.entities.Location;

@Repository
public interface ILocationRepository extends JpaRepository<Location, Integer>{

}
