package com.ts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ts.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Optional<Employee> findById(Long id);
	
//	Optional<Employee> findByName(String name);
	
	@Query(value = "SELECT * FROM employee WHERE name = :nm", nativeQuery = true)
	Optional<Employee> findEmp(@Param("nm") String name);
}
