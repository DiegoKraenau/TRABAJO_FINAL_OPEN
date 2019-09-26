package edu.rapisolver.rapisolverApp.service;


import java.util.List;
import java.util.Optional;

import edu.rapisolver.rapisolverApp.entities.DetalleServiceSupplier;



public interface IDetalleServicieSupplierService   extends CrudService<DetalleServiceSupplier>{

	Optional<DetalleServiceSupplier> findBydetailId(Integer id) throws Exception;
}
