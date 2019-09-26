package edu.rapisolver.rapisolverApp.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.rapisolver.rapisolverApp.entities.Reservation;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Integer>{

	public List<Reservation> findByReservationDate(Date reservationDate);
}
