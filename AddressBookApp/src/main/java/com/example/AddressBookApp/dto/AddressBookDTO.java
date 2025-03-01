package com.example.AddressBookApp.dto;

import com.example.AddressBookApp.model.AddressBookModel;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class AddressBookDTO {
    private Long id;
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
