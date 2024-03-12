package com.sitesh.emsbackend.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstname;
    @Column(name="last_name")
    private String lastname;
    @Column(name="email_id", nullable = false, unique = true)
    private String email;
    @Column(name="phone_number", nullable = false, unique = true)
    private int phoneno;
}
