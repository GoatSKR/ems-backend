package com.sitesh.emsbackend.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sitesh.emsbackend.dto.EmployeeDto;
import com.sitesh.emsbackend.entity.Employee;
import com.sitesh.emsbackend.mapper.EmployeeMapper;
import com.sitesh.emsbackend.repository.EmployeeRepository;
import com.sitesh.emsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto, MultipartFile file) throws IOException {
        Optional<Employee> userIdValue = employeeRepository.findByUserId(employeeDto.getUserId());
//        System.out.println(userIdValue.get().getUserId());
        if(!userIdValue.isPresent()){
            Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
            employee.setData(file.getBytes());
            Employee savedEmployee = employeeRepository.save(employee);
            return EmployeeMapper.mapToEmployeeDto(savedEmployee);
        }
        Employee employee = new Employee();
        employee.setUserId(employeeDto.getUserId());
        employee.setFirstname(employeeDto.getFirstname());
        employee.setLastname(employeeDto.getLastname());
        employee.setEmail(employeeDto.getEmail());
        employee.setPhoneno(employeeDto.getPhoneno());
        employee.setData(file.getBytes());

        System.out.println(employee.toString());
        employeeRepository.save(employee);
        EmployeeDto dto = objectMapper.convertValue(employee, EmployeeDto.class);
        return dto;

    }
}
