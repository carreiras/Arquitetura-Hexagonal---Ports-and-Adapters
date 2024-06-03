package com.github.carreiras.hexagonal.application.ports.out;

import com.github.carreiras.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
