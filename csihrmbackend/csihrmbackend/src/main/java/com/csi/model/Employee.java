package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private int empId;

    @Size(min = 2, message = "Employee First Name should be at least 2 character")
    private String empFirstName;

    @Size(min = 2, message = "Employee Last Name should be at least 2 character")
    private String empLastName;

    @Email(message = "Email Id Must be Valid")
    private String empEmailId;


}
