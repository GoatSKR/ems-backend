package com.sitesh.emsbackend.mapper;

import com.sitesh.emsbackend.dto.EmployeeDto;
import com.sitesh.emsbackend.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail(),
                employee.getPhoneno()

        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstname(),
                employeeDto.getLastname(),
                employeeDto.getEmail(),
                employeeDto.getPhoneno()
        );
    }
}
