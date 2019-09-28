package edu.rapisolver.rapisolverApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.rapisolver.rapisolverApp.entities.Qualification;

@Repository
public interface IQualificationRepository extends JpaRepository<Qualification, Integer> {

}
