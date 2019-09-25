package edu.rapisolver.rapisolverApp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.rapisolver.rapisolverApp.entities.DetalleServiceSupplier;
import edu.rapisolver.rapisolverApp.repository.IDetalleServiceSupplierRepository;

import edu.rapisolver.rapisolverApp.service.IDetalleServicieSupplierService;

@Service
@Transactional(readOnly = true)
public class DetalleServiceSupplierImpl  implements IDetalleServicieSupplierService{

	
	@Autowired
	private IDetalleServiceSupplierRepository detalleServiceSupplierRepository;
	
	@Override
	@Transactional
	public DetalleServiceSupplier save(DetalleServiceSupplier t) throws Exception {
		// TODO Auto-generated method stub
		return detalleServiceSupplierRepository.save(t);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		detalleServiceSupplierRepository.deleteById(id);
	}

	@Override
	public Optional<DetalleServiceSupplier> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return detalleServiceSupplierRepository.findById(id);
	}

	@Override
	public List<DetalleServiceSupplier> findAll() throws Exception {
		// TODO Auto-generated method stub
		return detalleServiceSupplierRepository.findAll();
	}

	@Override
	public List<DetalleServiceSupplier> findServicesConSupplier() throws Exception {
		// TODO Auto-generated method stub
		return detalleServiceSupplierRepository.findServicesConSupplier();
	}

}
