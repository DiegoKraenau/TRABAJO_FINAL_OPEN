package edu.rapisolver.rapisolverApp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.rapisolver.rapisolverApp.entities.Customer;
import edu.rapisolver.rapisolverApp.repository.ICustomerRepository;
import edu.rapisolver.rapisolverApp.service.ICustomerService;

@Service
@Transactional(readOnly = true)
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private ICustomerRepository customerRepository;

	@Override
	@Transactional
	public Customer save(Customer t) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.save(t);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}

	@Override
	public Optional<Customer> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	@Override
	public List<Customer> findAll() throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

}
