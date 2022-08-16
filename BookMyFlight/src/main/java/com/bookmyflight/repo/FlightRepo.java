package com.bookmyflight.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookmyflight.model.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long>{
	@Query("SELECT f FROM Flight f WHERE f.source = ?1 AND f.destination = ?2 AND f.departureDate = ?3")
	List<Flight> findBySearchFilters(String source, String destination, String departureDate);
}
