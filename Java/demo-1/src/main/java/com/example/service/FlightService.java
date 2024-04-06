package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Flight;
import com.example.repository.FlightRepository;

@Service
public class FlightService {
	@Autowired
	private FlightRepository fr;
	
	public Flight create(Flight flight) {
		return fr.save(flight);
	}
	public List<Flight> read() {
		return fr.findAll();
	}
	public Flight read(Integer id) {
		return fr.findById(id).orElseGet(null);
	}
	public Flight update(Flight flight) {
		Flight temp = read(flight.getId());
		if(temp!=null)
		{
			temp=flight;
			fr.save(temp);
		}
		return temp;		
	}
	public Flight delete(Integer id) {
		Flight flight = read(id);
		if(flight!=null)
		{
			fr.delete(flight);
		}
		return flight;
	}
	
}
