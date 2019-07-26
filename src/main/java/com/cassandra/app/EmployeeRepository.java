package com.cassandra.app;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.nisum.cassandra.entities.Employee;

@Repository
public interface EmployeeRepository extends CassandraRepository<Employee, String> {
	
}
