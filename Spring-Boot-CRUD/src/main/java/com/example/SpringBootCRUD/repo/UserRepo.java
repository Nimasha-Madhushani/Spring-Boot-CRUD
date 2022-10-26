package com.example.SpringBootCRUD.repo;

import com.example.SpringBootCRUD.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM User WHERE ID=?1", nativeQuery = true)
    User getUserBYUserID(String userId);

    @Query(value = "SELECT * from User WHERE ID=?1 AND ADDRESS=?2", nativeQuery = true)
    User getUserByUserIDAndAddress(String userId, String address);
}
