package com.felipedevos.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedevos.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
