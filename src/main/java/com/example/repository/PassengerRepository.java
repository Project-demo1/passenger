package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.passenger.Passenger;
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}

