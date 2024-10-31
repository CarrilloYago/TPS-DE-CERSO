package com.yago_microservices.department.service;

import com.yago_microservices.department.entity.Department;
import com.yago_microservices.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAll(){
        return departmentRepository.findAll();
    }

    public Department save(Department department){
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}

