package com.example.bankingappd11cw1.controller;

import com.example.bankingappd11cw1.model.Address;
import com.example.bankingappd11cw1.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/person/{personId}")
    public ResponseEntity<Address> addAddressToPerson(@PathVariable Long personId, @RequestBody Address address) {
        // Assuming you have logic to associate address with a person
        // For simplicity, let's say the address is already associated with the person
        Address savedAddress = addressService.saveAddress(address);
        return new ResponseEntity<>(savedAddress, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long id) {
        Optional<Address> address = addressService.getAddressById(id);