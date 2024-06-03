package com.github.carreiras.hexagonal.application.ports.out;

import com.github.carreiras.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
