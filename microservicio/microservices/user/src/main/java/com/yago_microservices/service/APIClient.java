package com.yago_microservices.service;

import com.yago_microservices.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="DEPARTMENT-SERVICE",url = "http://localhost:8082")
public interface APIClient {
    @GetMapping(value = "/departments/{id}")
    DepartmentDto getDepartmentById(@PathVariable("id") String departmentId);
}