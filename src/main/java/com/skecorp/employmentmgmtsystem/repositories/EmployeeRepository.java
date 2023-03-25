package com.skecorp.employmentmgmtsystem.repositories;

import com.skecorp.employmentmgmtsystem.entities.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
