package com.sitesh.emsbackend.service.impl;

import com.sitesh.emsbackend.dto.EmployeeDto;
import com.sitesh.emsbackend.entity.Employee;
import com.sitesh.emsbackend.mapper.EmployeeMapper;
import com.sitesh.emsbackend.repository.EmployeeRepository;
import com.sitesh.emsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
