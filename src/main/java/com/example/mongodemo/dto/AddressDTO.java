package com.example.mongodemo.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private String id;
    private String street;
    private String buildingNumber;
    private String apartmentNumber;
    private String city;
    private String zipCode;
}
