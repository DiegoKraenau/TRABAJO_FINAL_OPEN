package edu.rapisolver.rapisolverApp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.rapisolver.rapisolverApp.entities.Location;

import edu.rapisolver.rapisolverApp.repository.ILocationRepository;
import edu.rapisolver.rapisolverApp.service.ILocationService;


@Service
@Transactional(readOnly = true)
public class LocationServiceImpl implements ILocationService {

	
	@Autowired
	private ILocationRepository locationRepository;

	
	@Override
	@Transactional
	public Location save(Location t) throws Exception {
		// TODO Auto-generated method stub
		return locationRepository.save(t);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		locationRepository.deleteById(id);
	}

	@Override
	public Optional<Location> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return locationRepository.findById(id);
	}

	@Override
	public List<Location> findAll() throws Exception {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}

}
