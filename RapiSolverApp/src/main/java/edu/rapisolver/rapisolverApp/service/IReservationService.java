package edu.rapisolver.rapisolverApp.service;

import java.util.Date;
import java.util.List;

import edu.rapisolver.rapisolverApp.entities.Reservation;

public interface IReservationService extends CrudService<Reservation>{

	public List<Reservation> findByReservationDate(Date reservationDate);
}
