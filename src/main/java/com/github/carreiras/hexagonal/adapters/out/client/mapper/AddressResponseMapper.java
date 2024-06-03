package com.github.carreiras.hexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import com.github.carreiras.hexagonal.adapters.out.client.response.AddressResponse;
import com.github.carreiras.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
