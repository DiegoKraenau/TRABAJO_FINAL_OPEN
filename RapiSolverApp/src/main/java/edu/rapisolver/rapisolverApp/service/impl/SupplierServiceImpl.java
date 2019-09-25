package edu.rapisolver.rapisolverApp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.rapisolver.rapisolverApp.entities.Supplier;

import edu.rapisolver.rapisolverApp.repository.ISupplierRepository;
import edu.rapisolver.rapisolverApp.service.ISupplierService;


@Service
@Transactional(readOnly = true)
public class SupplierServiceImpl implements ISupplierService {

	@Autowired
	private ISupplierRepository supplierRepository;
	
	@Override
	@Transactional
	public Supplier save(Supplier t) throws Exception {
		// TODO Auto-generated method stub
		return supplierRepository.save(t);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		supplierRepository.deleteById(id);
	}

	@Override
	public Optional<Supplier> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return supplierRepository.findById(id);
	}

	@Override
	public List<Supplier> findAll() throws Exception {
		// TODO Auto-generated method stub
		return supplierRepository.findAll();
	}

}
