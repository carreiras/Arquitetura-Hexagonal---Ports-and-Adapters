package com.github.carreiras.hexagonal.adapters.out;

import com.github.carreiras.hexagonal.adapters.out.client.FindAddressesByZipCodeClient;
import com.github.carreiras.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.github.carreiras.hexagonal.application.core.domain.Address;
import com.github.carreiras.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressesByZipCodeClient findAddressesByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressesByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
