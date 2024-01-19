package com.blackbucks.bookmyshow.repositories;

import com.blackbucks.bookmyshow.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findById(int userId);
}
