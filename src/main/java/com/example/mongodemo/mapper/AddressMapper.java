package com.example.mongodemo.mapper;

import com.example.mongodemo.dto.AddressDTO;
import com.example.mongodemo.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toEntity(AddressDTO addressDTO);

    AddressDTO toDTO(Address address);
}
