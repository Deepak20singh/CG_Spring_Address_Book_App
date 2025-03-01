package com.example.AddressBookApp.dto;

import com.example.AddressBookApp.model.AddressBookModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AddressBookDTO {
    private Long id;
    @Pattern(regexp = "^[A-Za-z ]+$",message = "Name should contain alphabets and spaces")
    @NotNull(message="Employee name cannot be null")
    @Column(name="name")
    private String name;
    private String phone;
    private String email;

    public AddressBookDTO() {}

    public AddressBookDTO(AddressBookModel contact) {
        this.id=contact.getId();
        this.name = contact.getName();
        this.phone = contact.getPhone();
        this.email = contact.getEmail();
    }




}
