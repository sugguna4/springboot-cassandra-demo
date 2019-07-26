package com.nisum.cassandra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cassandra.app.CustomerRepository;
import com.nisum.cassandra.customer.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping("/saveWithTTL")
	public Customer saveCustomerByTTL(@RequestBody Customer customer) {
		return customerRepository.save(customer, 20);
		
	}
	
	@PostMapping("/saveCustomer")
	public Mono<Customer> saveCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
		
	}
	
	@GetMapping("/getAllCustomers")
	public Flux<Customer> getAll(){
		return customerRepository.findAll();
	}
	
}
