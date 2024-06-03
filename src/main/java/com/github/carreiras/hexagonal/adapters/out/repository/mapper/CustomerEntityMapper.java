package com.github.carreiras.hexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import com.github.carreiras.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.github.carreiras.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
