package com.github.carreiras.hexagonal.apllcation.ports.out;

import com.github.carreiras.hexagonal.apllcation.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
