package edu.rapisolver.rapisolverApp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.rapisolver.rapisolverApp.entities.ServiceCategory;

import edu.rapisolver.rapisolverApp.repository.IServiceCategoryRepository;

import edu.rapisolver.rapisolverApp.service.IServiceCategoryService;

@Service
@Transactional(readOnly = true)
public class ServiceCategoryImpl implements IServiceCategoryService {

	@Autowired
	private IServiceCategoryRepository serviceCategoryRepository;
	
	@Override
	@Transactional
	public ServiceCategory save(ServiceCategory t) throws Exception {
		// TODO Auto-generated method stub
		return serviceCategoryRepository.save(t);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		serviceCategoryRepository.deleteById(id);
	}

	@Override
	public Optional<ServiceCategory> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return serviceCategoryRepository.findById(id);
	}

	@Override
	public List<ServiceCategory> findAll() throws Exception {
		// TODO Auto-generated method stub
		return serviceCategoryRepository.findAll();
	}


}
