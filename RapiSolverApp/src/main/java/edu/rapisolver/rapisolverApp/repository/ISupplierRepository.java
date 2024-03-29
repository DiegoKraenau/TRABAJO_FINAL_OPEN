package edu.rapisolver.rapisolverApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.rapisolver.rapisolverApp.entities.Supplier;

@Repository
public interface ISupplierRepository extends JpaRepository<Supplier, Integer>{

	
}
