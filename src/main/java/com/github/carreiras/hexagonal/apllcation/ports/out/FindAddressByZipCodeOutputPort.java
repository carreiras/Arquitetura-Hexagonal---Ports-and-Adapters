package com.github.carreiras.hexagonal.apllcation.ports.out;

import com.github.carreiras.hexagonal.apllcation.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
