package com.example.SpringBootCRUD.repo;

import com.example.SpringBootCRUD.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
