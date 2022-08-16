package com.bookmyflight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookmyflight.model.Flight;
import com.bookmyflight.repo.FlightRepo;

@RestController
public class FlightController {
	@Autowired
	private FlightRepo flightRepo;

	@GetMapping("/flight")
	public List<Flight> getAllFlights() {
		return flightRepo.findAll();
	}
	
	@GetMapping("/flight/{to}/{from}/{date}")
	public List<Flight> getFlightsBySearchFilters(
			@PathVariable("to") String to,
			@PathVariable("from") String from,
			@PathVariable("date") String date) {
		return flightRepo.findBySearchFilters(to, from, date);
	}
	
	@PostMapping("/add")
	public void postFlight(@RequestBody Flight fl) {
		flightRepo.save(fl);
	}
}
