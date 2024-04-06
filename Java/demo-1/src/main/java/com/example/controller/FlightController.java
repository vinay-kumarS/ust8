package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Flight;
import com.example.service.FlightService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/flight")
public class FlightController {
	@Autowired
	private FlightService fs;
	
	@PostMapping
	public Flight addFlight(@RequestBody Flight flight) {
		return fs.create(flight);
	}
	
	@GetMapping
	public List<Flight> retrieveAllFlights() {
		return fs.read();
	}
	
	@GetMapping("/{id}")
	public Flight findFlightById(@PathVariable("id") Integer id) {
		return fs.read(id);
	}
	
	@PutMapping
	public Flight updateFlight(@RequestBody Flight flight) {
		return fs.update(flight);
	}
	
	@DeleteMapping("/{id}")
	public Flight deleteFlight(@PathVariable("id") Integer id) {
		return fs.delete(id);
	}
	
}
