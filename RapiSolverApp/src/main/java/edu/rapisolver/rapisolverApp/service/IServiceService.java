package edu.rapisolver.rapisolverApp.service;



import java.util.List;

import edu.rapisolver.rapisolverApp.entities.Servicio;

public interface IServiceService  extends CrudService<Servicio>{

	List<Servicio> findByserviceName(String serviceName) throws Exception;
	List<Servicio> findByserviceCategory(String serviceCategory) throws Exception;
}
