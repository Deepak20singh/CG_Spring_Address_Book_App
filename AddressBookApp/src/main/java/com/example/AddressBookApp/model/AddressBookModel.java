package com.example.AddressBookApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "addressdata")
public class AddressBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Pattern(regexp = "^[A-Za-z ]+$",message = "Name should contain alphabets and spaces")
    @NotNull(message="Employee name cannot be null")
    @Column(name="name")
    private String name;
    private String phone;
    private String email;

    public AddressBookModel(){

    }
    public AddressBookModel(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


}
