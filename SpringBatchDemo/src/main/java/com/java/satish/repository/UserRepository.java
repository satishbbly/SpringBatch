package com.java.satish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.satish.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
