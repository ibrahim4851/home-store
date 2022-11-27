package com.ibrahim.homestore.service;

import com.ibrahim.homestore.entity.Address;
import com.ibrahim.homestore.repo.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AddressService {

    private AddressRepository addressRepository;

    public Address createAddress(Address address){
        return addressRepository.save(address);

    }

    public Address editAddress(Address newAddress) {
        Address address = addressRepository.findAddressById(newAddress.getId());
        address.setTitle(newAddress.getTitle());
        address.setApartmentNo(newAddress.getApartmentNo());
        address.setStreet(newAddress.getStreet());
        address.setNeighborhood(newAddress.getNeighborhood());
        address.setProvince(newAddress.getProvince());
        address.setCity(newAddress.getCity());
        address.setFloor(newAddress.getFloor());
        address.setIsDefault(newAddress.getIsDefault());
        addressRepository.save(address);
        return address;
    }

    public void deleteById(Long addressId) {
        addressRepository.deleteById(addressId);
    }
}