package edu.rapisolver.rapisolverApp.service;


import java.util.List;

import edu.rapisolver.rapisolverApp.entities.DetalleServiceSupplier;



public interface IDetalleServicieSupplierService   extends CrudService<DetalleServiceSupplier>{

	 List<DetalleServiceSupplier> findServicesConSupplier() throws Exception;
}
