package org.example.springbootregloginapp.services;

import org.example.springbootregloginapp.entities.User;

public interface UserService {

    public boolean registerUser(User user);

    public User loginUser(String email, String password);
}
