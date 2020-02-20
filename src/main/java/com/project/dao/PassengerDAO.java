package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.dto.Passenger;

@Repository
@Transactional
@Component
public class PassengerDAO {
	

	@Autowired
	private EntityManager em;
	public void doSavePassenger(Passenger p)
	{
		em.persist(p);
		em.flush();
		System.out.println("Saved");
	}
	
	public List<Passenger> fetchAllPassenger()
	{
		List<Passenger> allPassenger=new ArrayList<Passenger>();
		
		allPassenger=em.createQuery("Select p from Passenger p",Passenger.class ).getResultList();
		return allPassenger;
	}

}
