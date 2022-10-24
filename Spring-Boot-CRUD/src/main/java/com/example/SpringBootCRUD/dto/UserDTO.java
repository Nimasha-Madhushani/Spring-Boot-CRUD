package com.example.SpringBootCRUD.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class UserDTO {
    @Id
    private int id;
    private String name;
    private String address;

}
