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
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {

        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO) {

        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserById/{userID}")
    public UserDTO getUserByUserID(@PathVariable String userID) {
        return userService.getUserByUserID(userID);
    }

    @GetMapping("/getUserByIdandAddress/{userID}/{address}")
    public UserDTO getUserByUserIDAndAddress(@PathVariable String userID,@PathVariable String address) {
        System.out.println("User ID:" + userID + "Address :" + address);
        return userService.getUserByUserIDAndAddress(userID, address);
    }
}
