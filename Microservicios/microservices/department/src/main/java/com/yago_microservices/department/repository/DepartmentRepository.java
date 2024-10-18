package com.yago_microservices.department.repository;

import com.yago_microservices.department.entity.Department;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
