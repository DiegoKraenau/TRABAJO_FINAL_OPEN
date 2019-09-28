package edu.rapisolver.rapisolverApp.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.rapisolver.rapisolverApp.entities.Reservation;
import edu.rapisolver.rapisolverApp.repository.IReservationRepository;
import edu.rapisolver.rapisolverApp.service.IReservationService;

@Service
@Transactional(readOnly = true)
public class ReservationServiceImpl implements IReservationService{

	@Autowired
	private IReservationRepository reservationReporitory;
	
	@Override
	@Transactional
	public Reservation save(Reservation t) throws Exception {
		
		return reservationReporitory.save(t);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		
		reservationReporitory.deleteById(id);
	}

	@Override
	public Optional<Reservation> findById(Integer id) throws Exception {
		
		return reservationReporitory.findById(id);
	}

	@Override
	public List<Reservation> findAll() throws Exception {
		
		return reservationReporitory.findAll();
	}

	@Override
	public List<Reservation> findByReservationDate(Date reservationDate) {
		
		return reservationReporitory.findByReservationDate(reservationDate);
	}

}
