package com.sitesh.emsbackend.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private UUID userId;
    private String firstname;
    private String lastname;
    private String email;
    private Long phoneno;
    private byte[] data;


}
