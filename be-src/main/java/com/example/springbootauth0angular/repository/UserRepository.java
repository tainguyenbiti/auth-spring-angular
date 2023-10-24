package com.example.springbootauth0angular.repository;


import com.example.springbootauth0angular.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
