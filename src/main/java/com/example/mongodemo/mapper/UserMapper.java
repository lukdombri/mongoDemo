package com.example.mongodemo.mapper;

import com.example.mongodemo.dto.UserDTO;
import com.example.mongodemo.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDTO userDTO);

    UserDTO toDTO(User user);
}
