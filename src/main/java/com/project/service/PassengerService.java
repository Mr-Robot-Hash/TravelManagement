package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.PassengerDAO;
import com.project.dto.Passenger;

@Service
public class PassengerService {

	
	 public PassengerDAO getPassengerDAO() {
		return passengerDAO;
	}
	public void setPassengerDAO(PassengerDAO passengerDAO) {
		this.passengerDAO = passengerDAO;
	}
	@Autowired
	private PassengerDAO passengerDAO;
	
	public List<Passenger> getAllPassenger() 
	{
		List<Passenger> allPassenger=new ArrayList<Passenger>();
		
		Passenger p1=new Passenger();
		p1.setId(1);
		p1.setName("Kiran");
		p1.setGender("Female");
		
		Passenger p2=new Passenger();
		p2.setId(2);
		p2.setName("Harsh");
		p2.setGender("Male");
		
		allPassenger.add(p1);
		allPassenger.add(p2);
		
		return allPassenger;		
		
	}
	public void doSavePass()
	{
		Passenger p1=new Passenger();
		p1.setId(2);
		p1.setName("medha");
		p1.setGender("Female");
		
		passengerDAO.doSavePassenger(p1);
		
		
	}
	
	public List<Passenger> fetchAllPassenger()
	{
		List<Passenger> allPassenger=new ArrayList<Passenger>();
		
		 allPassenger=passengerDAO.fetchAllPassenger();
		return allPassenger;
	}

}
