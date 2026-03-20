package org.example.springbootregloginapp.repositories;

import org.example.springbootregloginapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
