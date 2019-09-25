package edu.rapisolver.rapisolverApp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.rapisolver.rapisolverApp.entities.Servicio;


@Repository
public interface IServiceRepository extends JpaRepository<Servicio, Integer>{


	
}
