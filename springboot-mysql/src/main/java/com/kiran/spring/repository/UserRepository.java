package com.kiran.spring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiran.spring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable> {

}
