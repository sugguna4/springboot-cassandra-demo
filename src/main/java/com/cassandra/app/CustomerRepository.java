package com.cassandra.app;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

import com.nisum.cassandra.customer.Customer;
import com.nisum.cassandra.customer.CustomizedSave;

@Repository
public interface CustomerRepository extends ReactiveCassandraRepository<Customer, String> ,CustomizedSave<Customer>{
	
}
