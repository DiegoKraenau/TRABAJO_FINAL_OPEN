package edu.rapisolver.rapisolverApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.rapisolver.rapisolverApp.entities.DetalleServiceSupplier;

@Repository
public interface IDetalleServiceSupplierRepository extends JpaRepository<DetalleServiceSupplier, Integer> {

	@Query("Select m from DetalleServiceSupplier m ")
	public List<DetalleServiceSupplier> findServicesConSupplier() throws Exception;
}
