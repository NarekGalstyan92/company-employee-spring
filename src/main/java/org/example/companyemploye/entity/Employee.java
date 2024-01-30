package org.example.companyemploye.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String picName;

    @ManyToOne(fetch = FetchType.EAGER) // by default
    private Company company;
}
