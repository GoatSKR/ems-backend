package com.sitesh.emsbackend.controller;

import com.sitesh.emsbackend.dto.EmployeeDto;
import com.sitesh.emsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto, @RequestParam("file") MultipartFile file) throws IOException {
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto,file);
        System.out.println("savedEmployee - "+savedEmployee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);

    }
}
