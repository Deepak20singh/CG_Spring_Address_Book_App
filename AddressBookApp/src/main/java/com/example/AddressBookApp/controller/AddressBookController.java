package com.example.AddressBookApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class AddressBookController {
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    @PostMapping("/add")
    public String add(){
        return "Added";
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id){
        return "Updated";
    }
    @GetMapping("/all")
    public String all(){
        return "All data";
    }
    @GetMapping("/check/{id}")
    public String check(@PathVariable Long id){
        return "Element present";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return "Element deleted";
    }
}
