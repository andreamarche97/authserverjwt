package com.davide.webapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "user")
@Data
public class User {

    @Id
    @Column(name = "tax_code")
    private String taxCode;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
}
