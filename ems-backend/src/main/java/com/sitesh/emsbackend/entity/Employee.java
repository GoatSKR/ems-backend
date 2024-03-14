package com.sitesh.emsbackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "employees")
public class Employee {
    @Id
    private UUID userId;
    @Column(name="first_name")
    private String firstname;
    @Column(name="last_name")
    private String lastname;
    @Column(name="email_id", nullable = false, unique = true)
    private String email;
    @Column(name="phone_number", nullable = false, unique = true)
    private Long phoneno;
    @Lob
    private byte[] data;
}
