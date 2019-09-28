package edu.rapisolver.rapisolverApp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.rapisolver.rapisolverApp.entities.Servicio;
import edu.rapisolver.rapisolverApp.repository.IServiceRepository;

import edu.rapisolver.rapisolverApp.service.IServiceService;




@Service
@Transactional(readOnly = true)
public class ServiceServiceImpl implements IServiceService {

	@Autowired
	private IServiceRepository serviceRepository;
	
	@Override
	@Transactional
	public Servicio save(Servicio t) throws Exception {
		// TODO Auto-generated method stub
		return serviceRepository.save(t);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		serviceRepository.deleteById(id);
	}

	@Override
	public Optional<Servicio> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return serviceRepository.findById(id);
	}

	@Override
	public List<Servicio> findAll() throws Exception {
		// TODO Auto-generated method stub
		return serviceRepository.findAll();
	}

	@Override
	public List<Servicio> findByserviceName(String serviceName) throws Exception {
		// TODO Auto-generated method stub
		return serviceRepository.findByserviceName(serviceName);
	}

	@Override
	public List<Servicio> findByserviceCategory(String serviceCategory) throws Exception {
		// TODO Auto-generated method stub
		return serviceRepository.findByserviceCategory(serviceCategory);
	}

}
