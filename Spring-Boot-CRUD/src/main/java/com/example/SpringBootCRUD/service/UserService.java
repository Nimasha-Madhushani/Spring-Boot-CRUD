package com.example.SpringBootCRUD.service;

import com.example.SpringBootCRUD.dto.UserDTO;
import com.example.SpringBootCRUD.entity.User;
import com.example.SpringBootCRUD.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public List<UserDTO> getAllUser() {
        List<User> userList = userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>() {
        }.getType());

    }
}