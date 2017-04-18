package com.mitioglov.service;

import com.mitioglov.model.domain.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> listUsers();

    void removeUser(Integer id);

    User findByEmail(String email);

}
