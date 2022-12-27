package com.example.mongodemo.service;

import com.example.mongodemo.dto.UserDTO;
import com.example.mongodemo.mapper.UserMapper;
import com.example.mongodemo.model.User;
import com.example.mongodemo.repository.UserRepository;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public String saveUser(UserDTO userDTO) {
        return userRepository.save(userMapper.toEntity(userDTO)).getId();
    }

    public UserDTO getUser(String id) {
        Optional<User> userFromDb = userRepository.findById(id);
        return userMapper.toDTO(userFromDb.get());
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public Page<UserDTO> getUsers(PageRequest page) {
        return userRepository.findAll(page).map(userMapper::toDTO);
    }
}
