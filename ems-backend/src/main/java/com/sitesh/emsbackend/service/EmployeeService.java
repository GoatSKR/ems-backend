package com.sitesh.emsbackend.service;

import com.sitesh.emsbackend.dto.EmployeeDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto, MultipartFile image) throws IOException;

}
