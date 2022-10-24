package com.example.SpringBootCRUD.controller;

import com.example.SpringBootCRUD.dto.UserDTO;
import com.example.SpringBootCRUD.entity.User;
import com.example.SpringBootCRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<UserDTO> getUser() {
        return userService.getAllUser();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "User Updated";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "User Deleted";
    }
}
