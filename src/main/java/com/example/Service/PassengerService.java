package com.example.Service;
 import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.passenger.Passenger;
import com.example.repository.PassengerRepository;


@Service
public class PassengerService {

		@Autowired
		public PassengerRepository passengerRepo;

	public List<Passenger> getAllpassengers() {
		// TODO Auto-generated method stub
		List<Passenger> Passenger =new ArrayList<>();
		passengerRepo.findAll().forEach(Passenger::add);
		return Passenger;
	}

	public Passenger getpassenger(Integer id) {
		// TODO Auto-generated method stub
	   try
	   {
		return passengerRepo.findById(id).get();
	   }
	   catch(Exception e)
	   {
	  	 return null;
	   }
	}

	public void addpassenger(Passenger passenger) {
		passengerRepo.save(passenger);
		// TODO Auto-generated method stub
		
	}

	public void updatepassenger(Integer id, Passenger passenger) {
		// TODO Auto-generated method stub
		passengerRepo.save(passenger);
		}

	public void deletepassenger(Integer id) {
		// TODO Auto-generated method stub
		passengerRepo.deleteById(id);
		}
	}




