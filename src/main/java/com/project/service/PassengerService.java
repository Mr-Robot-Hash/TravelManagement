package com.project.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dto.Passenger;

@Service
public class PassengerService {

	
	@Autowired
	EntityManager em;
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
		p1.setId(1);
		p1.setName("Kiran");
		p1.setGender("Female");
		
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
	}

}
