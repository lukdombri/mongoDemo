package com.example.mongodemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
@Data
public class User {
    @Id
    private String id;
    private String name;
    private String lastname;
    private LocalDate birthdayDate;
    private String originCountry;
    private List<Address> addresses;
}
