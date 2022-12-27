package com.example.mongodemo.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class UserDTO {
    private String id;
    private String name;
    private String lastname;
    private LocalDate birthdayDate;
    private String originCountry;
    private List<AddressDTO> addresses;
}
