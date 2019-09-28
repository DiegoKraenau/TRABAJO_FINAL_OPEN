package edu.rapisolver.rapisolverApp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.rapisolver.rapisolverApp.entities.Qualification;
import edu.rapisolver.rapisolverApp.repository.IQualificationRepository;
import edu.rapisolver.rapisolverApp.service.IQualificationService;

@Service
@Transactional(readOnly = true)
public class QualificationServiceImpl implements IQualificationService {

	@Autowired
	private IQualificationRepository qualificationRepository;
	
	@Override
	public Qualification save(Qualification t) throws Exception {
		// TODO Auto-generated method stub
		return qualificationRepository.save(t);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		qualificationRepository.deleteById(id);
	}

	@Override
	public Optional<Qualification> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return qualificationRepository.findById(id);
	}

	@Override
	public List<Qualification> findAll() throws Exception {
		// TODO Auto-generated method stub
		return qualificationRepository.findAll();
	}

}
