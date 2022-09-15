package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.UserNotFoundException;
import com.example.Service.PassengerService;
import com.example.passenger.Passenger;



@RestController
public class PassengerController {
	@Autowired
	private PassengerService passengerservice;
	@RequestMapping("/Passenger")
	public List<Passenger> getAllpassengers()
	{
		List<Passenger> passenger = passengerservice.getAllpassengers();
		
		if(passenger.size() <= 0)
			throw new UserNotFoundException("Passenger details are not available, please update first.");
			
	  return passenger;
	}
	@GetMapping("/passenger/{id}")
	public Passenger getpassenger(@PathVariable Integer id)
	{
		Passenger passenger = passengerservice.getpassenger(id);
		
		if(passenger ==  null)
			throw new UserNotFoundException("Passenger ID are not present");
			
	  return passenger;
	}
	@RequestMapping(method =RequestMethod.POST , value="/passenger" )
	public void addpassenger(@RequestBody Passenger passenger)
	{
		passengerservice.addpassenger(passenger);
	}
	@RequestMapping(method =RequestMethod.PUT , value="/passenger/{id}" )
	public void updatepassenger(@PathVariable Integer id ,@RequestBody Passenger passenger)
	{
		passengerservice.updatepassenger(id,passenger);
	}
	@RequestMapping(method =RequestMethod.DELETE , value="/passenger/{id}" )
	public void Deletepassenger(@PathVariable Integer id)
	{
		passengerservice.deletepassenger(id);
	}
}


