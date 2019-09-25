package edu.rapisolver.rapisolverApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import edu.rapisolver.rapisolverApp.entities.ServiceCategory;

@Repository
public interface IServiceCategoryRepository extends JpaRepository<ServiceCategory, Integer>{

}
