package com.example.bankingappday12cw1.controller;

import com.example.bankingappday12cw1.model.Address;
import com.example.bankingappday12cw1.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/employee/{id}")
    public ResponseEntity<Address> mapAddressToEmployee(@RequestBody Address address, @PathVariable int id) {
        Address mappedAddress = addressService.mapAddressToEmployee(address, id);
        return new ResponseEntity<>(mappedAddress, HttpStatus.CREATED);
    }
}
