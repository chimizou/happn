package com.chimizou.employeemanager.service;

import com.chimizou.employeemanager.model.Employee;
import com.chimizou.employeemanager.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> listEmployees = employeeRepo.findAll();
        return listEmployees;
    }

    public void addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        employeeRepo.save(employee);
    }
}
