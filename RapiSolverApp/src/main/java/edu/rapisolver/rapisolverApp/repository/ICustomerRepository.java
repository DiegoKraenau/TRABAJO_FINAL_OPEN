package edu.rapisolver.rapisolverApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.rapisolver.rapisolverApp.entities.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

	
}
