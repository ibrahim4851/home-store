package com.ibrahim.homestore.controller;

import com.ibrahim.homestore.entity.Address;
import com.ibrahim.homestore.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address/")
@RequiredArgsConstructor
public class AddressController {

    private AddressService addressService;

    @PostMapping("add")
    public Address registerAddress(Address address){
        return addressService.createAddress(address);
    }

    @PutMapping("edit")
    public Address editAddress(Address address){
        return addressService.editAddress(address);
    }

    @PutMapping("delete")
    public void deleteAddress(Long addressId){
        addressService.deleteById(addressId);
    }

}
