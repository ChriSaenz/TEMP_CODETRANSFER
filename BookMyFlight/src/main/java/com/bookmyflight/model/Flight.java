package com.bookmyflight.model;

import java.util.Arrays;

public class Flight {
	private String airlines;
	private String source;
	private String destination;
	private String departureDate;	//	LocalDate: 2022-08-16
	private String departureTime;	//	LocalDateTime: 2022-08-16T08:46:56.477848100
	private String arrivalDate;
	private String arrivalTime;
	private int journeyDuration_Hours;
	private int journeyDuration_Minutes;
	private float adultFare;
	private float childFare;
	private int totalSeats;
	
	public Flight(String airlines, String source, String destination, String departureDate, String departureTime, String arrivalDate,
			String arrivalTime, int journeyDuration_Hours, int journeyDuration_Minutes, float adultFare,
			float childFare, int totalSeats) {
		super();
		this.airlines = airlines;
		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.journeyDuration_Hours = journeyDuration_Hours;
		this.journeyDuration_Minutes = journeyDuration_Minutes;
		this.adultFare = adultFare;
		this.childFare = childFare;
		this.totalSeats = totalSeats;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public float getAdultFare() {
		return adultFare;
	}
	public void setAdultFare(float adultFare) {
		this.adultFare = adultFare;
	}
	public float getChildFare() {
		return childFare;
	}
	public void setChildFare(float childFare) {
		this.childFare = childFare;
	}
	@Override
	public String toString() {
		return "Flight [source=" + source + ", destination=" + destination + ", departureDate=" + departureDate
				+ ", departureTime=" + departureTime + ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime
				+ ", journeyDuration=" + Arrays.toString(journeyDuration) + ", adultFare=" + adultFare + ", childFare="
				+ childFare + "]";
	}
	public int getJourneyDuration_Hours() {
		return journeyDuration_Hours;
	}
	public void setJourneyDuration_Hours(int journeyDuration_Hours) {
		this.journeyDuration_Hours = journeyDuration_Hours;
	}
	public int getJourneyDuration_Minutes() {
		return journeyDuration_Minutes;
	}
	public void setJourneyDuration_Minutes(int journeyDuration_Minutes) {
		this.journeyDuration_Minutes = journeyDuration_Minutes;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
}
