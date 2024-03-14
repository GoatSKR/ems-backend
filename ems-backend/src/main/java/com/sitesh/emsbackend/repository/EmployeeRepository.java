package com.sitesh.emsbackend.repository;

import com.sitesh.emsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByUserId(UUID userId);
}
