package com.ssr.empm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ssr.empm.model.*;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}