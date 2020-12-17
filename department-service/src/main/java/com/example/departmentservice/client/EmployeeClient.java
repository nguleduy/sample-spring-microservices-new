package com.example.departmentservice.client;

import com.example.departmentservice.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeClient {

  @GetMapping("/department/{departmentId}")
  List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
}
