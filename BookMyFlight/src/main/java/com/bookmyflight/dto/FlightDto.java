package com.bookmyflight.dto;

public class FlightDto {
	private String source;
	private String destination;
	private String departureDate;	//	LocalDate: 2022-08-16
	private String departureTime;	//	LocalDateTime: 2022-08-16T08:46:56.477848100
	private String arrivalDate;
	private String arrivalTime;
	private int[] journeyDuration = new int[2];
	private float adultFare;
	private float childFare;
	private int totalSeats;
}
