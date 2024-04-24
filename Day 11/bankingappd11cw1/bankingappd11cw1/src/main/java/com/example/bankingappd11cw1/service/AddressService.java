package com.examly.springapp.service;

import com.examly.springapp.model.Address;
import com.examly.springapp.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepository.findById(id);
    }

    public Address updateAddress(Address updatedAddress) {
        return addressRepository.save(updatedAddress);
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}