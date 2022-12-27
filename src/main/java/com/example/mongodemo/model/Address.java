package com.example.mongodemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Address {
    @Id
    private String id;
    private String street;
    private String buildingNumber;
    private String apartmentNumber;
    private String city;
    private String zipCode;
}
