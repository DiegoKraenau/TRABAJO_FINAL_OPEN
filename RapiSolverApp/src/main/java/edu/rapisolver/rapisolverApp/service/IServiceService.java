package edu.rapisolver.rapisolverApp.service;



import java.util.List;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.Query;

import edu.rapisolver.rapisolverApp.entities.Servicio;

public interface IServiceService  extends CrudService<Servicio>{

	List<Servicio> findByserviceName(String serviceName) throws Exception;
}
