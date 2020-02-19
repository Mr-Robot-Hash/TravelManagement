package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto.Passenger;
import com.project.service.PassengerService;

@RestController
public class PassengerController {
	
	@Autowired
	PassengerService passengerService;
	
	@GetMapping(path="/helloWorld")
	public String helloWorld() 
	{		
		return "HellowWorld";
	}
	
	@GetMapping(path="/getAllPassenger")
	public List<Passenger> getAllPassenger() 
	{		
		return passengerService.getAllPassenger();

	}
	
	@GetMapping(path="/doSavePass")
		public void doSavePass()
		{
		passengerService.doSavePass();
		}

}
